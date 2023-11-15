package cn.ysl.account.persist.aoplianxi;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Description:FaultBarrier
 *
 * @Author Yang ShunLi
 */
@Aspect
public class FaultBarrier {
    @Pointcut("execution(* *(..))")
    public void faultBarrierPointcut() {

    }
    @AfterThrowing(pointcut = "faultBarrierPointcut()" ,throwing = "e")
    public void AfterThrowingAdvice(RuntimeException e) {
        System.out.println("我们已经收到异常:"+e.getMessage());
    }
}