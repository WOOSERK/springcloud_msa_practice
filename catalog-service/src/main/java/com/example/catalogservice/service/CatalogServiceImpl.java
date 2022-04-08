package com.example.catalogservice.service;

import com.example.catalogservice.jpa.CatalogEntity;
import com.example.catalogservice.jpa.CatalogRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by WOOSERK.
 * User: WOOSERK
 * Date: 2022-04-08
 * Time: 오후 6:26
 */

@Data
@Slf4j
@Service
public class CatalogServiceImpl implements CatalogService
{
    private CatalogRepository catalogRepository;

    @Autowired
    public CatalogServiceImpl(CatalogRepository catalogRepository)
    {
        this.catalogRepository = catalogRepository;
    }

    @Override
    public Iterable<CatalogEntity> getAllCatalogs()
    {
        return catalogRepository.findAll();
    }
}
