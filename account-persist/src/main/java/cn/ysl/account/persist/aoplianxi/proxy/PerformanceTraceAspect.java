package cn.ysl.account.persist.aoplianxi.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Description:PerformanceTraceAspect
 *
 * @Author Yang ShunLi
 */
@Aspect
public class PerformanceTraceAspect {
    @Pointcut("execution(public void *.method1())")
    public void method1(){}
    @Pointcut ("execution(public void *.method2())")
    public void method2() {}
    @Pointcut ("method1() || method2()")
    public void compositePointcut(){};

    @Around("compositePointcut()")
    public Object performanceTrace(ProceedingJoinPoint joinpoint) throws Throwable{
        Object proceed = joinpoint.proceed();
        String name = joinpoint.getSignature().getName();
        System.out.println("time：" + name);
        return proceed;
    }

}