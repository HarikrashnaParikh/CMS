package com.argusoft.cms.repo;

import com.argusoft.cms.entity.OrderList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderListRepository extends JpaRepository<OrderList, Integer> {
    void deleteOrderListById(int id);
    OrderList findOrderListById(int id);

    List<OrderList> findByUserDetailId(int id);
    List<OrderList> findByItemId(int id);
    Optional<Object> findByIdAndUserDetailId(int orderListId, int userId);

    Optional<Object> findByIdAndItemId(int orderListId, int itemId);

}
