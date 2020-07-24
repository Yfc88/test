package com.yyz.sp01.service;

import com.yyz.sp01.pojo.Order;

public interface OrderService {
	
	Order getOrder(String orderId);
	void addOrder(Order order);

}
