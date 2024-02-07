package com.vismee.springaop.dao;

import com.vismee.springaop.account.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao
{
    /*
    Matches on pointcut expression :
    execution(public void addAccount())
    execution(public void com.vismee.springaop.dao.AccountDao.addAccount())
    execution(public void add*())
    execution(* add*())
    execution(* add*(..))
    execution(* com.vismee.springaop.dao.*.*(..))
    */
    @Override
    public void addAccount()
    {
        System.out.println(getClass() + " Inside addAccount without parameters");
    }

    /*
    Matches on pointcut expression :
    execution(* add*(com.vismee.springaop.account.Account, ..))
    execution(* add*(*,*))
    execution(* add*(..))
    execution(* com.vismee.springaop.dao.*.*(..))
    */
    @Override
    public void addAccount(Account account,boolean vip) {
        System.out.println(getClass() + " Inside addAccount - adding details into db");
    }

    /*
    Matches on pointcut expression :
    execution(* com.vismee.springaop.dao.*.*(..))
    */
    @Override
    public void accountDetails() {
        System.out.println(getClass() + " : Account details");
    }
}
