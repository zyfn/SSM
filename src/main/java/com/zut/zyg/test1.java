package com.zut.zyg;

import com.zut.zyg.Service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
@ComponentScan(basePackages = {"com.zut.zyg"})
public class test1 {
        @Autowired
        UserService userService;
    public static void main( String[] args )
    {
    }
    //    修改删除用户信息
    @Test
    public void test(){
        userService.alertInfo();
//        userService.deleteInfo();
    }
}
