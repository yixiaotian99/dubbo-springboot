package com.xiao.user.consumer.service;

import com.xiao.model.UserAddress;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author sunjinwei
 * @Date 2020-06-22 23:24
 * @Description TODO
 **/
@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;


    @Test
    void callSayHi() {

        for (int i = 0; i < 10; i++) {
            userService.callSayHi("张三,i=" + i);
        }
    }


    @Test
    void testFindUserAllAddress() {

        List<UserAddress> userAddrList = userService.findUserAddrList(null);

        for(UserAddress userAddress: userAddrList){
            System.out.println(userAddress);
        }
    }


}