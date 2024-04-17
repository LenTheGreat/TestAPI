package com.example.practice.repository;

import com.example.practice.model.AccountModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountRepository {
    private List<AccountModel> accountModels = new ArrayList<AccountModel>();

    public void createAccount(){
        accountModels = List.of(
        new AccountModel(1l, "Mark", "Allen", "Gullon", "markallengullon@gmail.com"),
        new AccountModel(2l, "Mark", "John", "Dulay", "markjohn@gmail.com"),
        new AccountModel(3l, "Lara", "Jane", "Salcedo", "larajane@gmail.com")
        );
    }

    public AccountRepository(){
        createAccount();
    }

    public List<AccountModel> getAllAccounts(){
        return accountModels;
    }

    public AccountModel findAccountById(long accountId){
        for(int i = 0; i < accountModels.size(); i++){
            if(accountModels.get(i).getAccountId() == accountId ){
                return accountModels.get(i);
            }
        }

        return null;
    }

    public List<AccountModel> searchByFirstName(String firstName){
        List<AccountModel> matchingAccount = new ArrayList<>();
        for(AccountModel account : accountModels){
            if(account.getAccountFirstName().equalsIgnoreCase(firstName)){
                matchingAccount.add(account);
            }
        }
        return matchingAccount;
    }

    public List<AccountModel> searchByMiddleName(String middleName){
        List<AccountModel> matchingAccount = new ArrayList<>();
        for(AccountModel account : accountModels){
            if(account.getAccountMiddleName().equalsIgnoreCase(middleName)){
                matchingAccount.add(account);
            }
        }
        return matchingAccount;
    }

    public List<AccountModel> searchByLastName(String lastName){
        List<AccountModel> matchingAccount = new ArrayList<>();
        for(AccountModel account : accountModels){
            if(account.getAccountLastName().equalsIgnoreCase(lastName)){
                matchingAccount.add(account);
            }
        }
        return matchingAccount;
    }







}
