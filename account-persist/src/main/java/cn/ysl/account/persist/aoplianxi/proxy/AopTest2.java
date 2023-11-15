package cn.ysl.account.persist.aoplianxi.proxy;

import cn.ysl.account.persist.aoplianxi.User;
import cn.ysl.account.persist.aoplianxi.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:AopTest
 *
 * @Author Yang ShunLi
 */
public class AopTest2 {
    NestableInvocationBO nestableInvocationBO;
    @Before
    public void method10() {
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("classpath:aopbeans.xml");
        nestableInvocationBO = (NestableInvocationBO) cpx.getBean("nestableInvocationBO");
    }
    @Test
    public void method() {
        nestableInvocationBO.method2();
        nestableInvocationBO.method1();
        String name = "";

    }
}