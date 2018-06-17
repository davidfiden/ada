package com.davidfiden.ada.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.davidfiden.ada.controller"})
public class DefaultRootConfig {

}
