package com.hellowx;

import com.hellowx.IOC.Account;
import com.hellowx.start.BeanFactory;
import com.hellowx.start.User;
import com.hellowx.start.UserService;
import com.hellowx.start.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/6/3
 */
public class TestSpring {
    @Test
    public void test1(){
        UserService  userService = new UserServiceImpl();
        userService.insert(new User());
        userService.queryUserByName("张三");
    }
    @Test
    public void test2(){
        UserService userService = (UserService) BeanFactory.getBean("userServiceNew");
        userService.insert(new User());
        userService.queryUserByName("张三");

    }

    @Test
    public void test3(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        User user = (User) ctx.getBean("user");
        System.out.println("user = " + user);
    }

    @Test
    public void test4(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Account acc = ctx.getBean(Account.class);
        System.out.println("acc = " + acc);
    }
}
