package javaTest.PowerJava.Chapter4;

//은행계좌를 나타내는 클래스 Account를 만들어보자.
//Account클래스는 잔액을 나타내는 balance필드만을 가진다.
//메소드로는 돈을 인출하는 withdraw(int amount)와 돈을 저금하는 deposit(int amount)를 정의한다.
//기타 필요한 메소드를 추가할 수 있고, Account생성자는 잔액을 0으로 초기화
// Account객체를 2개 생성하여 다음과 같이 테스트

class Account{
    String accountInfo;
    int balance=0;    //잔액

    void printString(){
        System.out.println("새로운 계좌가 만들어졌습니다.");
    }
    void withdraw(int amount){
        if(amount>balance){
            System.out.println("잔고보다 금액이 많습니다");
        }else{
            System.out.println(amount +"원을 출금하셨습니다.");
            balance-=amount;
        }
    }
    void deposit(int amount){
        balance = balance+amount;
        System.out.println(amount+"원 저축");
    }
    void printAccountInfo(String accountInfo){
        System.out.println(accountInfo+" 계좌 잔고="+balance);
    }
}

public class Chapter4_5 {
    public static void main(String aggs[]){
        Account account1 = new Account();
        Account account2 = new Account();

        account1.printString();
        account1.deposit(50000);

        account2.printString();
        account2.deposit(100000);

        account1.printAccountInfo("고객 #1");
        account2.printAccountInfo("고객 #2");
    }
}
