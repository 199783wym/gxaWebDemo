package com.gxa.cdut.controller;

import com.gxa.cdut.domain.Account;
import com.gxa.cdut.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author: ym
 * @Date: 2019/8/15 14:47
 * @Version 1.0
 */
@Controller
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("insert")
    public ModelAndView insertUser(){
        Account account = new Account();

        account.setUsername("wym");
        account.setPassword("666");

        accountService.insertAccount(account);
        ModelAndView mv = new ModelAndView("/account");
        List<Account> list = accountService.selectAll();
        mv.addObject("accounts",list);
        return mv ;

    }
    @RequestMapping("delect")
    public ModelAndView delect( @RequestParam(value="id") int id){
        accountService.delect(id);


        ModelAndView mv = new ModelAndView("/account");
        List<Account> list = accountService.selectAll();
        mv.addObject("accounts",list);
        return mv ;
    }

    @RequestMapping("update")
    public ModelAndView update(@RequestParam(value="id") int id){
        Account account =new Account();
        account.setId(id);
        account.setUsername("wymmmm");
        account.setPassword("nbbbbb");
        accountService.update(account);


        ModelAndView mv = new ModelAndView("/account");
        List<Account> list = accountService.selectAll();
        mv.addObject("accounts",list);
        return mv ;
    }



}
