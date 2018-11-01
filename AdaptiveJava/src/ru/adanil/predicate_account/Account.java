package ru.adanil.predicate_account;

public class Account {
    private long balance;
    private boolean isLoced;
    private String number;

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setLoced(boolean loced) {
        isLoced = loced;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public long getBalance() {
        return balance;
    }

    public boolean isLoced() {
        return isLoced;
    }

    public String getNumber() {
        return number;
    }

    public Account(long balance, boolean isLoced, String number) {
        this.balance = balance;
        this.isLoced = isLoced;
        this.number = number;
    }

    @Override
    public String toString() {
        return "balance: "+ balance+
                " number: "+ number+
                " isLockes: "+ isLoced;
    }
}
