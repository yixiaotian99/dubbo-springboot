package com.xiao.service;

import com.xiao.model.UserAddress;

import java.util.List;

/**
 * @Author sunjinwei
 * @Date 2020-06-18 17:57
 * @Description TODO
 **/
public interface OrderService {


    /**
     * 测试方法
     *
     * @param name
     * @return
     */
    String sayHello(String name);


    /**
     * 查询所有用户地址信息
     * @param id
     * @return
     */
    List<UserAddress> findUserAddrList(Long id);

}
