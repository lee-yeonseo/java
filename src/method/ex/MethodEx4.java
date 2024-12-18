package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                balance = deposit(balance);
            } else if (choice == 2) {
                balance = withdraw(balance);
            } else if (choice == 3) {
                balanceChenck(balance);
            } else {
                System.out.println("시스템을 종료합니다.");
                break;
            }
}
    }

    public static int deposit(int balance) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입금액을 입력하세요: ");
        int depositAmount = scanner.nextInt();
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }

    public static int withdraw(int balance) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출금액을 입력하세요: ");
        int withdrawAmount = scanner.nextInt();
        if(balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance);
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

    public static void balanceChenck(int balance) {
        System.out.println("현재 잔액: " + balance);
    }
}
