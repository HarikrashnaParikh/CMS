package com.argusoft.cms.service.serviceImpl;

import com.argusoft.cms.entity.OrderList;
import com.argusoft.cms.repo.OrderListRepository;
import com.argusoft.cms.service.OrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderListServiceImpl implements OrderListService {


    private final OrderListRepository orderListRepo;

    @Autowired
    OrderListServiceImpl(OrderListRepository orderListRepo) {
        this.orderListRepo = orderListRepo;
    }

    public OrderList addOrderList(OrderList orderList) {

        return orderListRepo.save(orderList);
    }

    public List<OrderList> findAllOrderLists() {
        return orderListRepo.findAll();
    }

    public OrderList updateOrderList(OrderList orderList) {
        return orderListRepo.save(orderList);
    }



    public OrderList findOrderListById(int id) {
        return orderListRepo.findOrderListById(id);
    }
    public List<OrderList> findByUserDetailId(int id){return orderListRepo.findByUserDetailId(id);}
    public List<OrderList> findByItemId(int id){return orderListRepo.findByItemId(id);}
    public Optional<Object> findByIdAndUserDetailId(int orderListId, int userId){
        return orderListRepo.findByIdAndUserDetailId(orderListId, userId);
    }

    public Optional<Object> findByIdAndItemId(int orderListId, int itemId){
        return orderListRepo.findByIdAndItemId(orderListId, itemId);
    }

    public void deleteOrderListById(int id){
        orderListRepo.deleteOrderListById(id);
    }
}
