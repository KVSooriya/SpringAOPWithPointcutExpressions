package com.vismee.springaop.dao;

import com.vismee.springaop.account.Account;

public interface AccountDao
{
    void addAccount();
    void addAccount(Account account,boolean vip);
    void accountDetails();
}
