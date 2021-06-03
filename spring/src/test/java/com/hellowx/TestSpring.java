package com.hellowx;

import com.hellowx.start.BeanFactory;
import com.hellowx.start.User;
import com.hellowx.start.UserService;
import com.hellowx.start.UserServiceImpl;
import org.junit.Test;

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
}
