package com.mininglamp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description 
 * @Author xxxx  
 * @Version 1.0
 **/

@SpringBootApplication
@MapperScan("com.mininglamp.dao")
@EnableDiscoveryClient
public class VideoApplication {

    public static void main(String [] args){

        SpringApplication.run(VideoApplication.class,args);
    }


}
