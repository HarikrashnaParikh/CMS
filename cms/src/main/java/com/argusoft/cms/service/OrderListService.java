package com.argusoft.cms.service;

import com.argusoft.cms.entity.OrderList;

import java.util.List;
import java.util.Optional;

public interface OrderListService {

    OrderList addOrderList(OrderList orderList);
    List<OrderList> findAllOrderLists();
    OrderList updateOrderList(OrderList orderList);
    void deleteOrderListById(int id);
    OrderList findOrderListById(int id);

    List<OrderList> findByUserDetailId(int id);
    List<OrderList> findByItemId(int id);

    Optional<Object> findByIdAndUserDetailId(int orderListId, int userId);

    Optional<Object> findByIdAndItemId(int orderListId, int itemId);

}
