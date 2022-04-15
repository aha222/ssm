package cn.hanna.spring5.bean;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class MyAspectJ2 {
    @Pointcut("execution(* cn.hanna.spring5.bean.TestAspectj.*(..))")
    public void pointCut(){

    }

    @Before(value = "pointCut()")
    public void beforeTest(JoinPoint joinPoint){
        System.out.println("前置测试......");
        System.out.println(joinPoint.getSignature().getName());
    }

    @After(value = "pointCut()")
    public void afterTest(){
        System.out.println("后置测试....");
    }

    @AfterReturning(value = "pointCut()",returning = "obj")
    public void afterTurnTest(JoinPoint joinPoint,Object obj){
        System.out.println("我是返回值后通知....");
        System.out.println(obj);
        System.out.println(joinPoint.getSignature().getName());
    }
    @Around(value = "pointCut()")
    public void aroundTest(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("我是环绕前通知.....");
        proceedingJoinPoint.proceed();
        System.out.println("我是环绕后通知.....");
        System.out.println(proceedingJoinPoint.getSignature().getName());
    }
}
