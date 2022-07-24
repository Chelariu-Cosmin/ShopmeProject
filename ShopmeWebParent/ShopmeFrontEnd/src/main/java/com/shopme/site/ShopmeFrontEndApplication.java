package com.shopme.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.shopme.site"})
public class ShopmeFrontEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopmeFrontEndApplication.class, args);
    }

}
