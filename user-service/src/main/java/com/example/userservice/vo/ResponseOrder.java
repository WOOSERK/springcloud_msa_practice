package com.example.userservice.vo;

import lombok.Data;

import java.util.Date;

/**
 * Created by WOOSERK.
 * User: WOOSERK
 * Date: 2022-04-08
 * Time: 오후 5:34
 */

@Data
public class ResponseOrder
{
    private String productId;
    private Integer qty;
    private Integer unitPrice;
    private Integer totalPrice;
    private Date createdAt;

    private String orderId;
}
