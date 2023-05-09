package com.argusoft.cms.controller;

import com.argusoft.cms.entity.OrderList;
import com.argusoft.cms.service.OrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orderList")
public class OrderListController {
    @Autowired
    private OrderListService orderListService;

    @GetMapping("/")
    public List<OrderList> getAllOrderList() {
        return orderListService.findAllOrderLists();
    }
    @GetMapping("/{id}")
    public OrderList getOrderListById(@PathVariable int id) {
        return orderListService.findOrderListById(id);
    }
    @GetMapping("/userDetail/{userId}")
    public List<OrderList> getAllOrderListsByUserDetailId(@PathVariable (value = "userId") int userId) {
        return orderListService.findByUserDetailId(userId);
    }
    @GetMapping("/{orderId}/item/{itemId}")
    public Optional<Object> getOrderListByIdandItemId(@PathVariable (value = "itemId") int itemId,
                                                      @PathVariable (value = "orderId") int orderId) {
        return orderListService.findByIdAndItemId(orderId,itemId);
    }
    @GetMapping("/item/{itemId}")
    public List<OrderList> getAllOrderListsByItemId(@PathVariable (value = "itemId") int itemId) {
        return orderListService.findByItemId(itemId);
    }
    @GetMapping("/{orderId}/userDetail/{userId}")
    public Optional<Object> getOrderListByIdandUserDetailId(@PathVariable (value = "userId") int userId,
                                                      @PathVariable (value = "orderId") int orderId) {
        return orderListService.findByIdAndItemId(orderId,userId);
    }



    @PostMapping("/add")
    public OrderList addOrderList(@RequestBody OrderList orderList) {
        return orderListService.addOrderList(orderList);
    }

    @PutMapping("/update")
    public OrderList updateOrderList(@RequestBody OrderList orderList) {
        return orderListService.updateOrderList(orderList);
    }

    @DeleteMapping("/{id}")
    public void deleteOrderList(@PathVariable int id) {
        orderListService.deleteOrderListById(id);
    }
}
