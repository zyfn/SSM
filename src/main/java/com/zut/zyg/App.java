//package com.zut.zyg;
//
//import com.zut.zyg.Service.UserService;
//import com.zut.zyg.ServiceImpl.UserServiceImpl;
//import com.zut.zyg.pojo.Conference;
//import com.zut.zyg.pojo.User;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
///**
// * Hello world!
// *
// */
////@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath:applicationContext.xml"})
////@ComponentScan(basePackages = {"com.zut.zyg"})
//public class App
//{
////    @Autowired
////    static UserService userService;
//    public static void main( String[] args )
//    {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = applicationContext.getBean(UserServiceImpl.class);
//        userService.alertInfo();
//    }
////    //    修改删除用户信息
////    @Test
////    public void test1(){
////        userService.alertInfo();
////        userService.deleteInfo();
////    }
//    //    显示会议名称和老板列表
//
//}