package com.xiao.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author sunjinwei
 * @Date 2020-06-23 10:21
 * @Description 模拟用户地址信息
 **/
@Data
public class UserAddress implements Serializable {


    private Long id;

    private String name;

    private Date createDate;

    public UserAddress(Long id, String name, Date createDate) {
        this.id = id;
        this.name = name;
        this.createDate = createDate;
    }
}
