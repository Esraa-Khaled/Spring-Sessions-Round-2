package com.example.orm.service;

import com.example.orm.entity.Account;
import com.example.orm.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;
    public Iterable<Account> findAll() {
        return accountRepository.findAll();
    }

    public Account add(Account account) {
        return accountRepository.save(account);
    }
}
