package com.this0.mapper;

import com.this0.pojo.Order;

public interface OrderMapper {
    Order selectOrderWithCustomer(Integer orderId);
}
