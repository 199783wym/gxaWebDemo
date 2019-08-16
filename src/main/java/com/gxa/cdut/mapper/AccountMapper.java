package com.gxa.cdut.mapper;

import com.gxa.cdut.domain.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: ym
 * @Date: 2019/8/15 10:48
 * @Version 1.0
 */

public interface AccountMapper {
     int insertAccount (Account account);
     Account  selectAccountById(int id);
     int  update(Account account);
     int  delectById(int a);
     List<Account> selectAll();
}
