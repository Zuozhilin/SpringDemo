package com.example.demo220725.service.Impl;

import com.example.demo220725.mapper.UserMapper;
import com.example.demo220725.service.UserService;
import com.example.demo220725.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
//网上看到 service和controller和compent 还有这个 都是没有本质区别的
@Repository
public class UserServiceImpl implements UserService {
    //这里就是需要把这个实现方法具体的写出来了,然后这里就需要加入注解了
    //这就是所谓的自动装配的功能吧
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUserList() {
        //就是因为这些调用来调用去的，让我觉得很绕，我姑且认为是，需要提高系统的可调度性
        //所以要做各种分层的操作，减少耦合度，这里的话，相当于就是要用具体操作了，可是其实就是把mapper的方法调用一些
        try{
            List<User> users= userMapper.getUserList();
            return users;

        }catch (Exception e){
            //好像是 如果不throw的话，会报错。。。
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public String AddUser(User user) {
        //这里也是调用对应的方法就行了
        try{
            //add方法返回的是int，但这个方法返回的是String
            int i=userMapper.AddUser(user);
            return "成功插入了"+i+"条数据";

        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public String DeleteUser(User user) {
        //这里也是调用对应的方法就行了
        try{
            //add方法返回的是int，但这个方法返回的是String
            int i=userMapper.DeleteUser(user);
            return "成功删除了"+i+"条数据";

        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public String UpdatePwd(User user) {
        //这里也是调用对应的方法就行了
        try{
            //add方法返回的是int，但这个方法返回的是String
            int i=userMapper.UpdatePwd(user);
            return "已更新密码！";

        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }
}

