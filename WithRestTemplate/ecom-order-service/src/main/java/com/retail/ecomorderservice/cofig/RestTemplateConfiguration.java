package com.retail.ecomorderservice.cofig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
class RestTemplateConfigurationConfiguration {

    @Bean
    public RestTemplate restTemplate (){
        return new RestTemplate();
    }

}

