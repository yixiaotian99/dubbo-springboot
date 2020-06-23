package com.xiao.user.consumer.service;

import com.xiao.model.UserAddress;
import com.xiao.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Author sunjinwei
 * @Date 2020-06-23 13:48
 * @Description 消费者的本地存根，用于消费者进行权限校验，参数校验工作
 **/
@Slf4j
public class UserServiceStub implements OrderService {


    private OrderService orderService;

    /**
     * 必须存在一个有参构造方法，用于 dubbo 自动封装代理对象
     *
     * @param orderService
     */
    public UserServiceStub(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public String sayHello(String name) {

        log.info("本地存根执行...sayHello");
        return null;
    }

    @Override
    public List<UserAddress> findUserAddrList(Long id) {

        log.info("本地存根执行...findUser");

        //添加如 参数校验 的逻辑
        if (!StringUtils.isEmpty(id)) {
            return orderService.findUserAddrList(id);
        }

        return null;
    }
}
