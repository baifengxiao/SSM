package com.this0.pojo;

import lombok.Data;

@Data
public class Order {
    private Integer orderId;
    private String orderName;
    private Customer customer;// 体现的是对一的关系

}