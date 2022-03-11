package com.company;

import java.util.Objects;

public class BankAccount {
    private int balance;

    public BankAccount(){

    }
    public BankAccount(int balance){
        this.balance = balance;

    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(){
        this.balance = balance;
    }

    public void takeMoney(int b){
        balance -= b;

    }
    public void addBalance(int a){
        balance += a;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return balance == that.balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance);
    }

    public String toString(){
        return "BankAccunt {"+
                "balance: "+balance;
    }

}
