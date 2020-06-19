package com.xiao.order.provider.service;

import com.xiao.service.OrderService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @Author sunjinwei
 * @Date 2020-06-18 17:59
 * @Description 订单接口实现，注意这里的 Service 是dubbo的
 **/
@Service
@Component
public class OrderServiceImpl implements OrderService {


    @Override
    public String sayHello(String name) {
        return null;
    }
}
