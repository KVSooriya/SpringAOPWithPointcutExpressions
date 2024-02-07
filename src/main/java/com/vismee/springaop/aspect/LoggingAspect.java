package com.vismee.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/* @Aspect - Special annotation for aspect - Aspect is just a java class to hold the advices together */
@Aspect
@Component
public class LoggingAspect
{
    // This is where we will add all our related advices together
    // @Before - To run the custom code before a method executes

    /*
    @Before("execution(public void addAccount())")
    public void logAccount()
    {
        System.out.println("Performing AOP logging");
    }
    */

    /*
    @Before("execution(public void com.vismee.springaop.dao.AccountDao.addAccount())")
    public void logAccount()
    {
        System.out.println("Performing AOP logging");
    }
    */

    /*
    @Before("execution(public void add*())")
    public void logAccount()
    {
        System.out.println("Performing AOP logging on any method that starts with add with return type void");
    }
    */

    /*
    @Before("execution(* add*())")
    public void logAccount()
    {
        System.out.println("Performing AOP logging on any method starting with add with any return type");
    }
    */

    /*
    @Before("execution(* add*(com.vismee.springaop.account.Account))")
    public void logAccount()
    {
        System.out.println("Performing AOP logging");
    }
    */

    /*
    @Before("execution(* add*(com.vismee.springaop.account.Account, ..))")
    public void logAccount()
    {
        System.out.println("Performing AOP logging");
    }
    */

    /*
    @Before("execution(* add*(*,*))")
    public void logAccount()
    {
       System.out.println("Performing AOP logging");
    }
    */

    /*
    @Before("execution(* add*(..))")
    public void logAccount()
    {
       System.out.println("Performing AOP logging");
    }
    */

    /*
    @Before("execution(* com.vismee.springaop.dao.*.*(..))")
    public void logAccount()
    {
       System.out.println("Performing AOP logging on any method inside dao package");
    }
    */

}





