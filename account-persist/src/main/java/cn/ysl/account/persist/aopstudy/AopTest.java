package cn.ysl.account.persist.aopstudy;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

/**
 * Description:AopTest
 *
 * @Author Yang ShunLi
 */
public class AopTest {
    public String say3(String msg) {
        System.out.println(msg);
        return "res";
    }

    public String say2(String msg) {
        System.out.println(msg);
        return "res";
    }

    public String hello(String msg) {
        System.out.println(msg);
        return "res";
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationcontext.xml");
        Object aopTest = context.getBean("aopTest");
        String res = ((AopTest)aopTest).hello("高兴");
        System.out.println(aopTest.getClass());
    }
}