package com.xiao.order.provider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author sunjinwei
 * @Date 2020-06-22 21:27
 * @Description 启动 dubbo 工程
 **/
@DubboComponentScan
@SpringBootApplication
public class OrderSerivceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderSerivceProviderApplication.class, args);
    }

}
