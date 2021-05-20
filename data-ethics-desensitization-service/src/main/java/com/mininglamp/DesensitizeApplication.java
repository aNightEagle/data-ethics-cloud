package com.mininglamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Description 
 * @Author zc  
 * @Version 1.0
 **/

@SpringBootApplication

//开启服务发现 nacos
@EnableDiscoveryClient

//开启Feign支持
@EnableFeignClients

public class DesensitizeApplication {

    public static void main(String [] args){

        SpringApplication.run(DesensitizeApplication.class,args);
    }



    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


}
