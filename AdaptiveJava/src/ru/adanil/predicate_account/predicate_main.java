package ru.adanil.predicate_account;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicate_main {
    public static void main(String[] args) {
        List<Account> nonEmptyAccounts = Arrays.asList(
                new Account(100,true,"1"),
                new Account(0,true,"2"),
                new Account(0,true,"3"),
                new Account(0,true,"4"),
                new Account(0,true,"5"),
                new Account(100,true,"6")
        );

        List<Account> accountsWithTooMuchMoney = Arrays.asList(
                new Account(100_000_001,true,"1"),
                new Account(100_000_001,false,"2"),
                new Account(0,true,"3"),
                new Account(0,true,"4"),
                new Account(0,true,"5"),
                new Account(100,true,"6")
        );

        nonEmptyAccounts=filter(nonEmptyAccounts,balance->balance.getBalance()>0);
        System.out.println(filter(accountsWithTooMuchMoney,
                balance->balance.isLoced()==false
                        && balance.getBalance()>100_000_000));

        System.out.println(nonEmptyAccounts);

    }

    public static <T> List<T> filter(List<T> accounts, Predicate<T> predicate){
        List<T> returnAc = new ArrayList<>();
        for (T ac:accounts) {
            if(predicate.test(ac))
                returnAc.add(ac);
        }
        return returnAc;
    }
}
