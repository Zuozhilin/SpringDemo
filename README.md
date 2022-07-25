# 工程简述
使用springboot+mybatis-plus+mysql框架基于maven搭建一个应用，完成增删改成服务接口。\
参考文章：https://blog.csdn.net/qq_41115379/article/details/109909267?spm=1001.2014.3001.5502   \
在原博主基础上进行增删改查功能的完善。
# 添加相关依赖
```
//提供对数据库的连接
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-jdbc</artifactId>
</dependency>
//提供web支持
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
//mybatis增强版插件
<dependency>
    <groupId>com.baomidou</groupId>
    <artifactId>mybatis-plus-boot-starter</artifactId>
    <version>3.4.2</version>
</dependency>
//提供与MySQL的连接支持
<dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <scope>runtime</scope>
</dependency>
```
# 创建MSC
## mapper(数据存储对象)
mapper层执行SQL语句，提供接口给service层。
## service(业务逻辑层)
service主要是针对具体的问题的操作，把一些数据层的操作进行组合，提供操作数据库的方法。
## controller(控制层)
controller通过service的接口来控制业务流程，也可通过接收前端传过来的参数进行业务操作。
## pojo(实现类)
pojo就是对应的数据库表的实体类。
# 连接数据库
```
spring.datasource.driver-class-name = com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/[1]?setUnicode=true&characterEncoding=utf8&serverTimezone=GMT
spring.datasource.username=[2]
spring.datasource.password=[3]
```
注：\
[1]自己创建的数据库名称\
[2]数据库的用户名\
[3]数据库的密码
# 测试链接
http://localhost:8080/getuserlist  //查看所有数据\
http://localhost:8080/deleteuser   //删除数据\
http://localhost:8080/updatepwd    //更新密码\
http://localhost:8080/addUser      //插入数据
