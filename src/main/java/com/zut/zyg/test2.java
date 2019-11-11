package com.zut.zyg;

import com.zut.zyg.pojo.Conference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
@ComponentScan(basePackages = {"com.zut.zyg"})
public class test2 {
    //    显示会议名称和老板列表
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Conference conference1 = (Conference)applicationContext.getBean("conference1");
        System.out.println("会议主题:"+conference1.getTheme());
        System.out.println("老板列表:");
        System.out.println("姓名    "+"公司    "+"车牌    "+"爱好");
        for(int i=0;i<conference1.getUsers().size();i++){
            System.out.println(conference1.getUsers().get(i).getName()+"\t"+conference1.getUsers().get(i).getCompony()+"\t"+conference1.getUsers().get(i).getCar().getBand()+"\t\t"+conference1.getUsers().get(i).getHabit()+"\t");
        }
    }
}
