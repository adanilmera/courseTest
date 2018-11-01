package ru.adanil.transaction_account;

import java.util.Date;

public class Transaction {
    private String uuid;
    private State state;
    private long sum;
    private Date created;

    public String getUuid() {
        return uuid;
    }

    public State getState() {
        return state;
    }

    public long getSum() {
        return sum;
    }

    public Date getCreated() {
        return created;
    }

    public Transaction(String uuid, State currentState, long sum, Date date) {
        this.uuid = uuid;
        this.state = currentState;
        this.sum = sum;
        this.created = date;
    }

    enum State{
        CANCELED,FINISHED,PROCESSING
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "uuid='" + uuid + '\'' +
                ", state=" + state +
                ", sum=" + sum +
                ", created=" + created +
                '}';
    }
}
