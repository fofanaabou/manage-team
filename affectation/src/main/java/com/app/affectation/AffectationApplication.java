package com.app.affectation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AffectationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AffectationApplication.class, args);
    }

}
