package com.gxa.cdut.service.impl;

import com.gxa.cdut.domain.Account;
import com.gxa.cdut.mapper.AccountMapper;
import com.gxa.cdut.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ym
 * @Date: 2019/8/15 14:53
 * @Version 1.0
 */
@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public int update(Account account) {
        return accountMapper.update(account);
    }

    @Override
    public int delect(int a) {
        return accountMapper.delectById(a);
    }

    @Override
    public List<Account> selectAll() {
        return  accountMapper.selectAll();
    }

    @Override
    public int insertAccount(Account account) {
        return  accountMapper.insertAccount(account);
    }
}
