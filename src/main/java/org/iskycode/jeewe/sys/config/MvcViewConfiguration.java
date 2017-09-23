package org.iskycode.jeewe.sys.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.accept.ContentNegotiationManagerFactoryBean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class MvcViewConfiguration {

    @Bean
    @ConfigurationProperties("spring.mvc.viewManager")
    public ContentNegotiationManager contentNegotiationManager() {
        // 声明contentNegotiationManagerFactory工厂实例，并根据配置参数填充对象。
        ContentNegotiationManagerFactoryBean contentNegotiationManagerFactory = new ContentNegotiationManagerFactoryBean();
        // 手动填充mediaTypes参数
        Map<String, MediaType> mediaTypes = new HashMap();
        mediaTypes.put("json", MediaType.APPLICATION_JSON_UTF8);
        mediaTypes.put("xml", MediaType.APPLICATION_XML);
        contentNegotiationManagerFactory.addMediaTypes(mediaTypes);
        // 返回contentNegotiationManager对象
        return contentNegotiationManagerFactory.getObject();
    }

    @Bean
    public ContentNegotiatingViewResolver contentNegotiatingViewResolver() {
        // 声明contentNegotiatingViewResolver实例。
        ContentNegotiatingViewResolver contentNegotiatingViewResolver = new ContentNegotiatingViewResolver();
        contentNegotiatingViewResolver.setOrder(1);
        contentNegotiatingViewResolver.setContentNegotiationManager(contentNegotiationManager());

        // 手动添加视图解决方案
        List<View> viewList = new ArrayList<View>();
        // Json视图解决方案
        MappingJackson2JsonView jsonView = new MappingJackson2JsonView();
        viewList.add(jsonView);
        contentNegotiatingViewResolver.setDefaultViews(viewList);
        // 返回contentNegotiatingViewResolver对象
        return contentNegotiatingViewResolver;
    }
}
