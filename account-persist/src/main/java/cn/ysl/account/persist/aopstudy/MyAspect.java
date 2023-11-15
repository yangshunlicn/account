package cn.ysl.account.persist.aopstudy;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.Ordered;

/**
 * Description:MyAspect
 *
 * @Author Yang ShunLi
 */
//@Aspect
public class MyAspect implements Ordered {
    @Pointcut("execution(* say*(*))")
    public void method() {}

    //@Before("method()")
    public void method2(JoinPoint joinPoint) {
        joinPoint.getArgs();
        System.out.println("init...");
    }
    @Before("execution(* say*(*)) && args(message)")
    public void method20(String message) {
        System.out.println("init...");
    }
    @AfterReturning(value = "method()",returning="result")
    public void myAdvice(String result) {
        System.out.println("我是跟屁虫...");
    }

    @AfterThrowing(value = "method()",throwing = "e")
    public void method3(JoinPoint joinPoint, RuntimeException e) {
        System.out.println("发生异常啦...");
    }
    @After("method()")
    public void method4() {
        System.out.println("释放资源...");
    }
    @Around("execution(* say*(*))")
    public String method5(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around前");
        String res = (String) proceedingJoinPoint.proceed();
        System.out.println("around后");
        return res+":ysl";
    }

    @Override
    public int getOrder() {
        return 10;
    }
}