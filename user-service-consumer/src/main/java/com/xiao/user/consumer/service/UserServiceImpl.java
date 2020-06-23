package com.xiao.user.consumer.service;

import com.xiao.model.UserAddress;
import com.xiao.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author sunjinwei
 * @Date 2020-06-22 23:14
 * @Description 提供用户接口，注意这里的 @Service 是 Spring 的
 **/
@Slf4j
@Service
public class UserServiceImpl implements UserService {


    /**
     * 不使用 @Autowired 而是使用 dubbo 的引用
     */
    @Reference
    private OrderService orderService;


    @Override
    public String callSayHi(String name) {

        log.info("userService callSayHi, name:{}", name);

        //远程 rpc 调用
        orderService.sayHello(name);

        return name;
    }


    /**
     * 查询所有用户地址
     */
    @Override
    public List<UserAddress> findUserAddrList(Long id) {

        log.info("userService find user addrs, id:{}", id);


        //远程 rpc 调用
        List<UserAddress> userAddrList = orderService.findUserAddrList(id);

        return userAddrList;
    }


}
