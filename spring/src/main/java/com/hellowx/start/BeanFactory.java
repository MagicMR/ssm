package com.hellowx.start;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/6/3
 */
public class BeanFactory {
    public static Properties pro=new Properties();

    static {
        InputStream is=null;
        try {
            is = BeanFactory.class.getResourceAsStream("/applicationContext.properties");
            pro.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static Object getBean(String key){
        Object bean=null;
        try {
            Class clazz = Class.forName(pro.getProperty(key));
            bean = clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return bean;
    }
}
