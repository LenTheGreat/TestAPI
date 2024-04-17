package com.example.practice.controller;

import com.example.practice.model.AccountModel;
import com.example.practice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping(path="/allAccounts")
    public List<AccountModel> getAllAccounts(){
        return accountService.getAllAccounts();
    }

    @GetMapping(path="/{accountId}")
    public AccountModel findAccountById(@PathVariable(value = "accountId")long accountId){
        return accountService.findAccountByid(accountId);
    }

    @GetMapping(path="/search")
    public List<AccountModel> searchAccounts(@RequestParam(value = "firstName", required = false) String firstName,
                                             @RequestParam(value = "middleName", required = false) String middleName,
                                             @RequestParam(value = "lastName", required = false) String lastName)
    {
        return accountService.searchAccount(firstName,middleName,lastName);
    }
}
