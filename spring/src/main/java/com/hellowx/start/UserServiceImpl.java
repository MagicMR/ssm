package com.hellowx.start;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/6/3
 */
public class UserServiceImpl implements UserService{

    UserDAO userDAO=new UserDAOImpl();

    @Override
    public void insert(User user) {
        userDAO.insert(user);
    }

    @Override
    public void queryUserByName(String name) {
        userDAO.queryUserByName(name);
    }
}
