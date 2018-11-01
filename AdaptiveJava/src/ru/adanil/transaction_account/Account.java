package ru.adanil.transaction_account;

import java.util.List;

public class Account {
    private String number;
    private long balance;
    private List<Transaction> transactions;

    public String getNumber() {
        return number;
    }

    public long getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public Account(String number, long balance, List<Transaction> transactions) {
        this.number = number;
        this.balance = balance;
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", transactions=" + transactions +
                '}';
    }
}
