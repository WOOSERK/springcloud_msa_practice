package com.example.userservice.jpa;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by WOOSERK.
 * User: WOOSERK
 * Date: 2022-04-08
 * Time: 오전 3:16
 */

public interface UserRepository extends CrudRepository<UserEntity, Long>
{
    UserEntity findByUserId(String userId);
}
