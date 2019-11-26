package com.zut.zyg;

import com.zut.zyg.Service.UserService;
import com.zut.zyg.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class test6 {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
        userService.selectById(1);
        List<Integer> list = Arrays.asList(1,10,16,22);
        userService.selectByListId(list);
        userService.selectByUserName("小明");

        User user = new User(1,"已修改");
        userService.updateUser(user);

        User user1 = new User(2,"测试","这是地址");
        userService.insertUser(user1);

        userService.selectUserByOrderId(3);
        userService.selectOrderByUserName("张三");
        userService.selectWoodByUserName("张三");
    }
}

