package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private static ArrayList<User> users = new ArrayList<User>();

    static {
        users.add(new User(1,"Nguyễn Văn Nguyên","nvn@gamil.com","03434343487","avata.img","123456"));
        users.add(new User(2,"Nguyễn Anh Tú","tu@gamil.com","03434343487","avata.img","123456"));
        users.add(new User(3,"Nguyễn Văn Luan","luan@gamil.com","03434343487","avata.img","123456"));
        users.add(new User(4,"Nguyễn Văn Ánh","anh@gamil.com","03434343487","avata.img","123456"));

    }

    @Override
    public List<User> getListUser() {
        return users;
    }
}
