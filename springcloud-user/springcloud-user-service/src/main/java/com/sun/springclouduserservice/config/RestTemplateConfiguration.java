package com.sun.springclouduserservice.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RestTemplateConfiguration
 * @Description TODO
 * Author sunhong
 * Date 2020-08-01 18:25
 **/


@Configuration
public class RestTemplateConfiguration {


    @Bean
    public RestTemplate getRestTemplate(RestTemplateBuilder restTemplateBuilder){

        return restTemplateBuilder.build();
    }

}
