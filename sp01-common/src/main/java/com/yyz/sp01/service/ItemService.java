package com.yyz.sp01.service;

import java.util.List;

import com.yyz.sp01.pojo.Item;

public interface ItemService {
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);

}
