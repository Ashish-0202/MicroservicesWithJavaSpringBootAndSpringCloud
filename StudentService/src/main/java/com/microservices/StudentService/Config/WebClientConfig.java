package com.microservices.StudentService.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${addressServiceUrl}")
    private String addressServiceUrl;

    @Bean
    public WebClient webClient(){
        WebClient webClient = WebClient.builder()
                .baseUrl(addressServiceUrl)
                .build();

        return webClient;
    }
}
