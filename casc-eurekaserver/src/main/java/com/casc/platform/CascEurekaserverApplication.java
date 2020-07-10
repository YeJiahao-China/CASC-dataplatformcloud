package com.casc.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CascEurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(CascEurekaserverApplication.class, args);
    }

}
