package com.this0.mapper;

import com.this0.pojo.Customer;

public interface CustomerMapper {
    Customer selectCustomerWithOrderList(Integer customerId);
}
