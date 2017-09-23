package org.iskycode.jeewe.sys.config;

import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.iskycode.jeewe.sys.security.UserRealm;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
@Order(1)
public class ShiroConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "shiro.filter")
    public ShiroFilterFactoryBean shiroFilter() {
        ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();

        shiroFilter.setSecurityManager(securityManager());

        // 设定权限过滤规则
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
        filterChainDefinitionMap.put("/s/**", "authc, roles[sysAdmin]");
        filterChainDefinitionMap.put("/a/**", "authc");
        filterChainDefinitionMap.put("/l/**", "anon");

        // 配合actuator模块，配置访问角色
        // 显示 Spring Boot 自动配置的信息
        filterChainDefinitionMap.put("/autoconfig", "roles[sysAdmin]");
        // 显示应用中包含的 Spring bean 的信息
        filterChainDefinitionMap.put("/beans", "roles[sysAdmin]");
        // 显示应用中的配置参数的实际值
        filterChainDefinitionMap.put("/configprops", "roles[sysAdmin]");
        // 生成一个 thread dump
        filterChainDefinitionMap.put("/dump", "roles[sysAdmin]");
        // 显示从 ConfigurableEnvironment 得到的环境配置信息
        filterChainDefinitionMap.put("/env", "roles[sysAdmin]");
        // 显示应用的健康状态信息
        filterChainDefinitionMap.put("/health", "roles[sysAdmin]");
        // 显示应用的基本信息
        filterChainDefinitionMap.put("/info", "roles[sysAdmin]");
        // 显示应用的性能指标
        filterChainDefinitionMap.put("/metrics", "roles[sysAdmin]");
        // 显示 Spring MVC 应用中通过“@RequestMapping”添加的路径映射
        filterChainDefinitionMap.put("/mappings", "roles[sysAdmin]");
        // 关闭应用
        filterChainDefinitionMap.put("/shutdown", "roles[sysAdmin]");
        // 显示应用相关的跟踪（trace）信息
        filterChainDefinitionMap.put("/trace", "roles[sysAdmin]");

        shiroFilter.setFilterChainDefinitionMap(filterChainDefinitionMap);

        return shiroFilter;
    }

    @Bean
    public SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(userRealm());
        securityManager.setRememberMeManager(cookieRememberMeManager());
        return securityManager;
    }

    @Bean
    public UserRealm userRealm() {
        UserRealm userRealm = new UserRealm();
        return userRealm;
    }

    /*
     * 开启Shiro注解
     */
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor() {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager());
        return authorizationAttributeSourceAdvisor;
    }

    @Bean
    @ConfigurationProperties(prefix = "shiro.cookie")
    public SimpleCookie simpleCookie() {
        SimpleCookie simpleCookie = new SimpleCookie();
        return simpleCookie;
    }

    @Bean
    public CookieRememberMeManager cookieRememberMeManager() {
        CookieRememberMeManager cookieRememberMeManager = new CookieRememberMeManager();
        cookieRememberMeManager.setCookie(simpleCookie());
        return cookieRememberMeManager;
    }
}
