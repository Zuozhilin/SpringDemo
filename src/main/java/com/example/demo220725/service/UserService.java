package com.example.demo220725.service;

import com.example.demo220725.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
//也是没有写对应的注解的，到时候可以改一下
@Service
public interface UserService {
    //和mapper相呼应，有一个对应的方法
    List<User> getUserList();
    String AddUser(User user);

    String DeleteUser(User user);

    String UpdatePwd(User user);
}

