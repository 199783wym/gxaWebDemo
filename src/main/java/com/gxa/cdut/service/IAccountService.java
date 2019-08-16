package com.gxa.cdut.service;

import com.gxa.cdut.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ym
 * @Date: 2019/8/15 14:53
 * @Version 1.0
 */

public interface IAccountService {
    int insertAccount (Account account);
    List<Account> selectAll ();
    int delect(int a);
    int update(Account account);
}
