package com.gulimall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class CouponRun {
    public static void main(String[] args) {
        SpringApplication.run(CouponRun.class,args);
    }
}
