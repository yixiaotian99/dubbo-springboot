package com.xiao.order.provider.service;

import cn.hutool.core.thread.ThreadUtil;
import com.xiao.model.UserAddress;
import com.xiao.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Method;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author sunjinwei
 * @Date 2020-06-18 17:59
 * @Description 订单接口实现，注意这里的 Service 是dubbo的
 **/
@Slf4j
@Service(timeout = 4000, version = "1.0", loadbalance = "random")
@Component
public class OrderServiceImpl implements OrderService {


    @Override
    public String sayHello(String name) {

        log.info("sayHello, name:{}", name);

        return name;
    }

    @Override
    public List<UserAddress> findUserAddrList(Long id) {

        log.info("old-find all user address, id:{}", id);

        List<UserAddress> userAddressList = new ArrayList<>();

        if (StringUtils.isEmpty(id)) {
            UserAddress u1 = new UserAddress(1L, "测试地址一", new Date());
            UserAddress u2 = new UserAddress(2L, "测试地址二", new Date());

            userAddressList.add(u1);
            userAddressList.add(u2);
        } else {

            UserAddress u = new UserAddress(id, "测试地址" + id, new Date());
            userAddressList.add(u);

        }
//
//        //模拟超时
//        ThreadUtil.sleep(3000);

        return userAddressList;
    }
}
