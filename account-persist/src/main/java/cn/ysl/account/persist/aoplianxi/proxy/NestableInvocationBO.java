package cn.ysl.account.persist.aoplianxi.proxy;

import org.springframework.aop.framework.AopContext;

/**
 * Description:NestableInvocationBO
 *
 * @Author Yang ShunLi
 */
public class NestableInvocationBO {
    public void method1() {
        ((NestableInvocationBO)AopContext.currentProxy()).method2();
        System.out.println("method1 executed");
    }
    public void method2() {
        System.out.println("method2 executed");
    }
}