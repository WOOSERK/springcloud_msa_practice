package com.example.userservice.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by WOOSERK.
 * User: WOOSERK
 * Date: 2022-04-08
 * Time: 오전 2:27
 */

@Component
@Data
//@AllArgsConstructor
public class Greeting
{
    @Value("${greeting.message}")
    private String message;
}
