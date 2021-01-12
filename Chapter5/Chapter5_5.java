package javaTest.Chapter5;

import java.util.Scanner;

class BankAccount{
    private int balance;

    protected BankAccount(int input) {
        this.balance = input;
    }
    protected BankAccount() {
        this.balance = 0;
    }

    public int transfer(int amount, BankAccount otherAccount) {
        otherAccount.balance += amount;
        this.balance -= amount;
        return amount;
    }

    public String toString(){
        return "현재 잔액은 " + balance + "입니다.";
    }
}

public class Chapter5_5 {
    public static void main(String args[]){
        BankAccount myAccount1 = new BankAccount(10000);
        BankAccount myAccount2 = new BankAccount();

        System.out.println("myAccount1: "+myAccount1.toString());
        System.out.println("myAccount2: "+myAccount2.toString());

        System.out.println("transfer(" + myAccount1.transfer(1000, myAccount2) + ")"); // 계좌 이체

        System.out.println("myAccount1: "+ myAccount1.toString());
        System.out.println("myAccount2: "+ myAccount2.toString());

    }
}
