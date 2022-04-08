package com.example.userservice.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

/**
 * Created by WOOSERK.
 * User: WOOSERK
 * Date: 2022-04-08
 * Time: 오전 3:35
 */

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseUser
{
    private String email;
    private String name;
    private String userId;

    private List<ResponseOrder> orders;
}
