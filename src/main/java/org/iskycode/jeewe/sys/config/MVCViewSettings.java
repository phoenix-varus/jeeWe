package org.iskycode.jeewe.sys.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManagerFactoryBean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class MVCViewSettings {

    @Bean
    @ConfigurationProperties("spring.mvc.viewManager")
    public ContentNegotiationManagerFactoryBean contentNegotiationManager() {
        ContentNegotiationManagerFactoryBean contentNegotiationManager = new ContentNegotiationManagerFactoryBean();
        Map<String, MediaType> mediaTypes = new HashMap();
        mediaTypes.put("json", MediaType.APPLICATION_JSON_UTF8);
        mediaTypes.put("xml", MediaType.APPLICATION_XML);
        contentNegotiationManager.addMediaTypes(mediaTypes);
        return contentNegotiationManager;
    }

    @Bean
    public ContentNegotiatingViewResolver contentNegotiatingViewResolver() {
        ContentNegotiatingViewResolver contentNegotiatingViewResolver = new ContentNegotiatingViewResolver();
        contentNegotiatingViewResolver.setOrder(1);
        contentNegotiatingViewResolver.setContentNegotiationManager(contentNegotiationManager().getObject());

        List<View> viewList = new ArrayList<View>();
        MappingJackson2JsonView jsonView = new MappingJackson2JsonView();
        viewList.add(jsonView);
        contentNegotiatingViewResolver.setDefaultViews(viewList);
        return contentNegotiatingViewResolver;
    }
}
