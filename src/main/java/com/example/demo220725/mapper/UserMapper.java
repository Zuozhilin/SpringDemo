package com.example.demo220725.mapper;

import com.example.demo220725.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    @Select("select * from user order by user_id")
    List<User> getUserList();

    @Insert("insert into user(username,password,age,sex,user_id) values(#{username},#{password},#{age},#{sex},#{user_id})")
    int AddUser(User user);

    @Delete("delete from user where username=#{username}")
    int DeleteUser(User user);

    @Update("update user set password = #{password} where username = #{username}")
    int UpdatePwd(User user);
}