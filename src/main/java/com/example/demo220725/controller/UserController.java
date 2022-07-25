package com.example.demo220725.controller;

import com.example.demo220725.pojo.User;
import com.example.demo220725.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userServer;

    @RequestMapping("/getuserlist") //显示所有数据
    public List<User> getUserList()
    {
        return userServer.getUserList();
    }

    @RequestMapping("/addUser")//添加数据
    public String addUser(User user){
        return userServer.AddUser(user);
    }

    @RequestMapping("/deleteuser")//删除数据
    public String deleteUser(User user){
        return userServer.DeleteUser(user);
    }

    @RequestMapping("/updatepwd")//修改密码
    public String updataPwd(User user){
        return userServer.UpdatePwd(user);
    }
}
