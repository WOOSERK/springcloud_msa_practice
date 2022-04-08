package com.example.orderservice.service;

import com.example.orderservice.dto.OrderDto;
import com.example.orderservice.jpa.OrderEntity;
import com.example.orderservice.jpa.OrderRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by WOOSERK.
 * User: WOOSERK
 * Date: 2022-04-08
 * Time: 오후 6:26
 */

@Data
@Slf4j
@Service
public class OrderServiceImpl implements OrderService
{
    private OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository)
    {
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderDto createOrder(OrderDto orderDto)
    {
        orderDto.setOrderId(UUID.randomUUID().toString());
        orderDto.setTotalPrice(orderDto.getQty() * orderDto.getUnitPrice());

        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        OrderEntity orderEntity = mapper.map(orderDto, OrderEntity.class);

        orderRepository.save(orderEntity);

        OrderDto returnValue = mapper.map(orderEntity, OrderDto.class);

        return returnValue;
    }

    @Override
    public OrderDto getOrderByOrderId(String orderId)
    {
        OrderEntity orderEntity = orderRepository.findByOrderId(orderId);
        OrderDto orderDto = new ModelMapper().map(orderEntity, OrderDto.class);

        return orderDto;
    }

    @Override
    public Iterable<OrderEntity> getOrdersByUserId(String userId)
    {
        return orderRepository.findByUserId(userId);
    }
}
