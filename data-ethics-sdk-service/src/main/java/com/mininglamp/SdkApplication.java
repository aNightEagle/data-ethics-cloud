package com.mininglamp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description 
 * @Author zc  
 * @Version 1.0
 **/

@SpringBootApplication
@MapperScan("com.mininglamp.dao")
@EnableDiscoveryClient
public class SdkApplication {

    public static void main(String [] args){

        SpringApplication.run(SdkApplication.class,args);
    }


}
