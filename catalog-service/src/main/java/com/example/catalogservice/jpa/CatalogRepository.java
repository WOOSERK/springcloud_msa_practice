package com.example.catalogservice.jpa;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by WOOSERK.
 * User: WOOSERK
 * Date: 2022-04-08
 * Time: 오후 6:22
 */

public interface CatalogRepository extends CrudRepository<CatalogEntity, Long>
{
    CatalogEntity findByProductId(String productId);
}
