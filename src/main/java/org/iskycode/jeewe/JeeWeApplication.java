package org.iskycode.jeewe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author phoenix
 *
 *         Spring Boot 启动器
 */
@ComponentScan // 组件遍历
@EnableAutoConfiguration // 自动配置
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class }) // 声明为启动器
public class JeeWeApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JeeWeApplication.class, args);
	}
}
