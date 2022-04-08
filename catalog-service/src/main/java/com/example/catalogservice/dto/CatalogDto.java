package com.example.catalogservice.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by WOOSERK.
 * User: WOOSERK
 * Date: 2022-04-08
 * Time: 오후 6:24
 */

@Data
public class CatalogDto implements Serializable
{
    private String productId;
    private Integer qty;
    private Integer unitPrice;
    private Integer totalPrice;

    private String orderId;
    private String userId;
}
