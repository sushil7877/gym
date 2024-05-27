package com.gpc.jodhpur.gym.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI().info(new Info().title("Phoebus Fitness Center")
                .description("You are on Phoebus Fitness Center")
                .contact(new Contact().name("Team Phoebus").email("phoebus.fitness@gmail.com")));
    }
}
