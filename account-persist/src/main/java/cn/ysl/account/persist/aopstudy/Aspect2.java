package cn.ysl.account.persist.aopstudy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.Ordered;

/**
 * Description:Aspect2
 *
 * @Author Yang ShunLi
 */
@Aspect
public class Aspect2 implements Ordered {
    @DeclareParents(value = "cn.ysl.account.persist.aopstudy.AopTest",defaultImpl = IntroductionAdviceImpl.class)
    private IntroductionAdvice advice;
    @Pointcut("execution(* say*(*))")
    public void method() {
    }
    @Before("method()")
    public void method1() {
        System.out.println("Before one");
    }
    @Before("method()")
    public void method2() {
        System.out.println("Before two");
    }
    @AfterReturning("method()")
    public void method3() {
        System.out.println("AfterReturning one");
    }
    @AfterReturning("method()")
    public void method4() {
        System.out.println("AfterReturning two");
    }
    @After("method()")
    public void method5() {
        System.out.println("after one");
    }
    @After("method()")
    public void method6() {
        System.out.println("after two");
    }

    @Around("method()")
    public void method7(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around before1");
        pjp.proceed();
        System.out.println("Around after1");
    }
    @Around("method()")
    public void method8(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around before2");
        pjp.proceed();
        System.out.println("Around after2");
    }

    @Override
    public int getOrder() {
        return 20;
    }
}