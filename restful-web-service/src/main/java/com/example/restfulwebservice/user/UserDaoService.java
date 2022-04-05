package com.example.restfulwebservice.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by WOOSERK.
 * User: WOOSERK
 * Date: 2022-04-02
 * Time: 오후 9:51
 */

@Service
public class UserDaoService
{
    private static List<User> users = new ArrayList<>();
    private static int userCount = 3;

    static {
        users.add(new User(1, "Kenneth", new Date(), "pass1", "701010-1111111"));
        users.add(new User(2, "Alice", new Date(), "pass2", "801010-2222222"));
        users.add(new User(3, "Elena", new Date(), "pass3", "901010-1111111"));
    }

    public List<User> findAll()
    {
        return users;
    }

    public User save(User user)
    {
        if(user.getId() == null)
            user.setId(++userCount);

        users.add(user);
        return user;
    }

    public User findOne(int id)
    {
        for(User user : users)
        {
            if(user.getId() == id)
                return user;
        }

        return null;
    }

    public User deleteById(int id)
    {
        Iterator<User> iterator = users.iterator();

        while(iterator.hasNext())
        {
            User user = iterator.next();
            if(user.getId() == id)
            {
                iterator.remove();
                return user;
            }
        }

        return null;
    }

    public User update(User user)
    {
        for(User u : users)
        {
            if(u.getId() == user.getId())
            {
                u.setName(user.getName());
                u.setJoinDate(user.getJoinDate());
            }

            return u;
        }

        return null;
    }
}