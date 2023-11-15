package cn.ysl.account.persist.aoplianxi;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Description:FaultBarrier
 *
 * @Author Yang ShunLi
 */
@Aspect
public class SecurityAspect {
    @Pointcut("execution(* login(*))")
    public void securityPointcut() {
    }
    @Around("securityPointcut()")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        User user = (User) joinPoint.getArgs()[0];
        if ("ysl".equals(user.getUsername()) || "rw".equals(user.getUsername())) {
            System.out.println("用户符合条件");
            return joinPoint.proceed();
        } else {
            System.out.println("非法用户");
            throw new Exception("非法用户");
        }
    }


}