package com.example.orderservice.vo;

import lombok.Data;

/**
 * Created by WOOSERK.
 * User: WOOSERK
 * Date: 2022-04-08
 * Time: 오후 9:51
 */

@Data
public class RequestOrder
{
    private String productId;
    private Integer qty;
    private Integer unitPrice;
}
