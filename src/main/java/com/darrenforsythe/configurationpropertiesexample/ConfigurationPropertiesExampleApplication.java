package com.darrenforsythe.configurationpropertiesexample;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(MyProperties.class)
public class ConfigurationPropertiesExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationPropertiesExampleApplication.class, args);
    }

    @Bean
    ApplicationRunner printProperties(MyProperties myProperties) {
        return args -> myProperties
                .getSomeobject()
                .forEach((key, person) -> System.out.println(key + " - " + person));
    }
}
