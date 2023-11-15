package cn.ysl.account.persist.aopstudy;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.core.Ordered;

import java.lang.reflect.Method;

/**
 * Description:Aspect2
 *
 * @Author Yang ShunLi
 */
@Aspect
public class Aspect5 implements Ordered, MethodBeforeAdvice {


//    @Before("method()")
//    public void method2() {
//        System.out.println("Aspect3 Before two");
//    }
//    @AfterReturning("method()")
//    public void method3() {
//        System.out.println("Aspect3 AfterReturning one");
//    }
//    @AfterReturning("method()")
//    public void method4() {
//        System.out.println("Aspect3 AfterReturning two");
//    }
//    @After("method()")
//    public void method5() {
//        System.out.println("Aspect3 after one");
//    }
//    @After("method()")
//    public void method6() {
//        System.out.println("Aspect3 after two");
//    }
//
//    @Around("method()")
//    public void method7(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("Aspect3 Around before1");
//        pjp.proceed();
//        System.out.println("Aspect3 Around after1");
//    }
//    @Around("method()")
//    public void method8(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("Aspect3 Around before2");
//        pjp.proceed();
//        System.out.println("Aspect3 Around after2");
//    }

    @Override
    public int getOrder() {
        return 20;
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Aspect5 Before one");
    }
}