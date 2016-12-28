package com.kodz.schema;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by michal.kodz on 13-11-2015.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.kodz.schema.bean, com.kodz.schema.controller")
public class AppConfigura {
}
