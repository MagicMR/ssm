package com.hellowx.start;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/6/3
 */
public interface UserService {
    void insert(User user);
    void queryUserByName(String name);
}
