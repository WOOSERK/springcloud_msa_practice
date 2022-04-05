package com.example.restfulwebservice.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by WOOSERK.
 * User: WOOSERK
 * Date: 2022-04-02
 * Time: 오후 11:14
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse
{
    private Date timestamp;
    private String message;
    private String details;
}
