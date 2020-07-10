package com.casc.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CascCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CascCommonApplication.class, args);
    }

}
