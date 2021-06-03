package com.hellowx.start;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/6/3
 */
public class UserDAOImpl implements UserDAO{
    @Override
    public void insert(User user) {
        System.out.println("insert user");
    }

    @Override
    public void queryUserByName(String name) {
        System.out.println("query by" + name);
    }
}
