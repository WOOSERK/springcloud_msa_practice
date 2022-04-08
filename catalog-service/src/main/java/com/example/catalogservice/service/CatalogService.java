package com.example.catalogservice.service;

import com.example.catalogservice.jpa.CatalogEntity;

/**
 * Created by WOOSERK.
 * User: WOOSERK
 * Date: 2022-04-08
 * Time: 오후 6:26
 */

public interface CatalogService
{
    Iterable<CatalogEntity> getAllCatalogs();
}
