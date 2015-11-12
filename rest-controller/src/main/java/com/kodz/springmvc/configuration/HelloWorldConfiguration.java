package com.kodz.springmvc.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by michal.kodz on 04-11-2015.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.kodz.springmvc")
public class HelloWorldConfiguration {
}
