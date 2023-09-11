package com.itheima.reggie.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 购物车
 */
@Data
public class ShoppingCart implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;

    //名称
    private String name;

    //用户id
    private long userId;

    //菜品id
    private long dishId;

    //套餐id
    private long setmealId;

    //口味
    private String dishFlavor;

    //数量
    private int number;

    //金额
    private BigDecimal amount;

    //图片
    private String image;

    private LocalDateTime createTime;

}
