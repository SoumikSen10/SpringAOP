package springbootaop.logging;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging
{
    @Before("execution(public void springbootaop.service.UserService.login())")
    public void loggingAdvice1()
    {
        System.out.println("Before advice for login is executed");
    }

    @After("execution(public void springbootaop.service.UserService.login())")
    public void loggingAdvice2()
    {
        System.out.println("Running after advice for login.");
    }

    @Around("execution(public void springbootaop.service.UserService.login())")
    public void loggingAdvice3()
    {
        System.out.println("Before and After invoking method login");
    }

    @AfterThrowing("execution(public void springbootaop.service.UserService.logout())")
    public void loggingAdvice4()
    {
        System.out.println("Exception thrown in logOut method");
    }

    @AfterReturning("execution(public void springbootaop.service.UserService.logout())")
    public void loggingAdvice5()
    {
        System.out.println("After Returning advice for logout is run");
    }

    @Pointcut("execution(public * springbootaop.service.UserService.*(..))")
    public void pointCut(){}

    @Pointcut("execution(public * springbootaop.service.UserService.*(..))")
    public void pointCut1(){}

    @Before("pointCut() || pointCut1()")
    public void loggingAdvice6()
    {
        System.out.println("Before advice using pointcut is executed");
    }
}
