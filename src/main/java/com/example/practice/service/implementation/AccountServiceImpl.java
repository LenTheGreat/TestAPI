package com.example.practice.service.implementation;

import com.example.practice.model.AccountModel;
import com.example.practice.repository.AccountRepository;
import com.example.practice.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<AccountModel> getAllAccounts() {
        return accountRepository.getAllAccounts();
    }

    @Override
    public AccountModel findAccountByid(long accountId) {
        return accountRepository.findAccountById(accountId);
    }

    @Override
    public List<AccountModel> searchByFirstName(String firstName) {
        return accountRepository.searchByFirstName(firstName);
    }

    @Override
    public List<AccountModel> searchByMiddleName(String middleName) {
        return accountRepository.searchByMiddleName(middleName);
    }

    @Override
    public List<AccountModel> searchByLastName(String lastName) {
        return accountRepository.searchByLastName(lastName);
    }

    @Override
    public List<AccountModel> searchAccount(String firstName, String middleName, String lastName) {
        if(firstName != null && !firstName.isEmpty()){
            return accountRepository.searchByFirstName(firstName);
        } else if(middleName != null && !middleName.isEmpty()){
            return accountRepository.searchByMiddleName(middleName);
        } else if(lastName != null && !lastName.isEmpty()){
            return accountRepository.searchByLastName((lastName));
        }else{
            return null;
        }
    }
}
