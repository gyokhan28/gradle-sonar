package com.example.styles_api;

import feign.RequestInterceptor;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StyleConfig {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return template -> {
            template.header("Authorization", "Bearer fOrQroiBlnU1kC9MnkcTjjeuFBmvmYmNivg7QaXuE3n6ghJ66oIWRoCr5qXpZKDj");};
    }

    @Bean
    public ErrorDecoder errorDecoder() {
        return new CustomErrorDecoder();
    }

}
