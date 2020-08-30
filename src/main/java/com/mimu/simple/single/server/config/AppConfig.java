package com.mimu.simple.single.server.config;

import com.mimu.simple.single.server.App2Server;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses= App2Server.class)
public class AppConfig {
}
