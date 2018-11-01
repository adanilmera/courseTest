package ru.adanil.transaction_account;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class main {
//    List<Transaction> tr1 =

    public static void main(String[] args) {
        List<Account> accounts = Arrays.asList(
                new Account("8910", 0,Arrays.asList(
                        new Transaction("ewqewqkel", Transaction.State.CANCELED,1000,new Date()))),
                new Account("891021", 8000,Arrays.asList(
                        new Transaction("ewqewqkel2", Transaction.State.FINISHED,8000,new Date()),
                        new Transaction("ewqewqkel2", Transaction.State.CANCELED,10000,new Date()))
                )
        );

//        Stream<Account> stream = accounts.stream();
//
//        stream.filter(pred-> pred.getBalance()>0).forEach(s->System.out.println(s.toString()+"\n"));

        System.out.println(calcSumOfCanceledTransOnNonEmptyAccounts(accounts));
    }

    public static long calcSumOfCanceledTransOnNonEmptyAccounts(List<Account> accounts) {
        Stream<Account> stream = accounts.stream();

        Long total2 = stream.filter(pred-> pred.getBalance()>0)
                .flatMap(tr->tr.getTransactions().stream())
                .filter(tr2->tr2.getState()== Transaction.State.CANCELED)
                .mapToLong(Transaction::getSum).reduce((s1,s2)->s1+s2).orElse(0);

        return total2;

//        stream.filter(pred-> pred.getBalance()>0)
//                .forEach(acc->acc.getTransactions().stream()
//                .filter(tr->tr.getState()== Transaction.State.CANCELED)
//                .forEach(s-> total.addAndGet(s.getSum())));
//        return total.longValue();
    }
}
