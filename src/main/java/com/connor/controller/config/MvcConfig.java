package com.connor.controller.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.text.SimpleDateFormat;

@Configuration
public class MvcConfig {

    @Bean
    public MappingJackson2HttpMessageConverter objectMapper() {
        // 需要依赖
        //<groupId>com.fasterxml.jackson.core</groupId>
        //<artifactId>jackson-databind</artifactId>
        //<version>2.12.3</version>
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        return new MappingJackson2HttpMessageConverter(objectMapper);
    }

}
