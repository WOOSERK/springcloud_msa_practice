package com.example.orderservice.jpa;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by WOOSERK.
 * User: WOOSERK
 * Date: 2022-04-08
 * Time: 오후 6:22
 */

public interface OrderRepository extends CrudRepository<OrderEntity, Long>
{
    OrderEntity findByOrderId(String orderId);
    Iterable<OrderEntity> findByUserId(String userId);
}
