package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<User, BankAccount> user = new HashMap<User, BankAccount>();
        User user1 = new User("Kunzaada","Bekzhanova");
        user.put(new User("Kunzaada","Bekzhanova"),new BankAccount(417616));
        user.put(new User("Umar","Bekzhanov"),new BankAccount(417356));
        user.put(new User("Tair","Tashbaev"),new BankAccount(4126616));
        user.put(new User("Nurzaada","Bekzhanova"),new BankAccount(4139456));
        user.put(new User("Hadizha","Bekzhanova"),new BankAccount(4176145));
        user.put(new User("Amin","Bekzhanov"),new BankAccount(41761544));
        user.put(new User("Perizat","Altmyshova"),new BankAccount(4151616));
        user.put(new User("Aitolkun","Tashbaeva"),new BankAccount(4655766));
        user.put(new User("Aizharkyn","Tashbaeva"),new BankAccount(432165));
        user.put(new User("Madina","Tashbaeva"),new BankAccount(49664565));

        for (User i :user.keySet()) {
            System.out.println("key: " + i + " value: " + user.get(i));
        }

        transaction(user,user1,45000);
    }
    public static void transaction(Map<User, BankAccount> map, User user, int money){
        BankAccount bankAccount = map.get(user);
        System.out.println("Остаток баланса: "+bankAccount.getBalance());
        System.out.println("Ваш расход: "+money);
        bankAccount.takeMoney(money);
        System.out.println("Остаток баланса: "+bankAccount.getBalance());


        }
    }

