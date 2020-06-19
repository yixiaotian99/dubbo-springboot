package com.xiao.order.provider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@DubboComponentScan
@SpringBootApplication
public class OrderSerivceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderSerivceProviderApplication.class, args);
    }

}
