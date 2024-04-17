package com.example.practice.service;

import com.example.practice.model.AccountModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {
    List<AccountModel> getAllAccounts();
    AccountModel findAccountByid(long accountId);
    List<AccountModel> searchByFirstName(String firstName);
    List<AccountModel> searchByMiddleName(String middleName);
    List<AccountModel> searchByLastName(String lastName);

    List<AccountModel> searchAccount(String firstName, String middleName, String lastName);
}
