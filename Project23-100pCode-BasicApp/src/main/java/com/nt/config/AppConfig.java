package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
@ComponentScan(basePackages = "com.nt.beans")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig.AppConfig");
    }

    @Bean("ldt")
    public LocalDateTime createLocalDateNTime(){
        System.out.println("AppConfig.createLocalDateNTime");
        LocalDateTime ldt = LocalDateTime.now();
        return ldt;

    }

}
