package com.task.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.task.config.DBConfig;

@Configuration
@ComponentScan(basePackages = {
		"com.task.service",
		"com.task.dao"
})
@Import({DBConfig.class})
public class RootApplicationContextConfig {

}
