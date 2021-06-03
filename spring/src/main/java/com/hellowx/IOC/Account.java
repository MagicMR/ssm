package com.hellowx.IOC;

import java.util.List;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/6/3
 */
public class Account {
    String username;
    Integer age;
    Dog pet;
    List<String> hobby;
    Properties pro;
    public Account() {
    }

    public Account(String username) {
        this.username = username;
    }

    public Account(Integer age) {
        this.age = age;
    }

    public Account(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public Properties getPro() {
        return pro;
    }

    public void setPro(Properties pro) {
        this.pro = pro;
    }

    public Dog getPet() {
        return pet;
    }

    public void setPet(Dog pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                ", hobby=" + hobby +
                ", pro=" + pro +
                '}';
    }
}
