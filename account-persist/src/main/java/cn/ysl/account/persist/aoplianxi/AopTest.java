package cn.ysl.account.persist.aoplianxi;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Description:AopTest
 *
 * @Author Yang ShunLi
 */
public class AopTest {
    UserService userServiceImpl;
    @Before
    public void method10() {
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("classpath:aopbeans.xml");
        userServiceImpl = (UserService) cpx.getBean("userService");
    }
    @Test
    public void method() {
        userServiceImpl.login(new User("ysl0","123"));
    }
}