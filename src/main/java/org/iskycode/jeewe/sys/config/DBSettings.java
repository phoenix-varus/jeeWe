package org.iskycode.jeewe.sys.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "db")
public class DBSettings {
    private String url;
    private String username;
    private String password;
}