package com.example.orm.controller;

import com.example.orm.entity.Account;
import com.example.orm.entity.Employee;
import com.example.orm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account/v1")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/findall")
    public Iterable<Account> getAllAccounts() {
        return accountService.findAll();
    }

    @PostMapping("/add")
    public Account addAccount(@RequestBody Account account) {
        return accountService.add(account);
    }


}
