package com.xiao.user.consumer.service;

import com.xiao.model.UserAddress;

import java.util.List;

/**
 * @Author sunjinwei
 * @Date 2020-06-22 23:14
 * @Description TODO
 **/
public interface UserService {

    /**
     * 远程 rpc 调用
     *
     * @param name
     * @return
     */
    String callSayHi(String name);


    /**
     * 远程 rpc 调用用户地址方法
     *
     * @param id
     * @return
     */
    List<UserAddress> findUserAddrList(Long id);

}
