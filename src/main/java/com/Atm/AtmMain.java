package com.Atm;
import java.util.Scanner;
public class AtmMain {
    public static void main(String[] args) {
        AtmOperation atmoperation = new AtmOperation();
        Scanner sc = new Scanner(System.in);
        String pin = "12345";
        while (true) {
            System.out.println("Enter The Pin:");
            String PinCode = sc.nextLine();
            if (PinCode.equals(pin)) {
                System.out.println("Pin Is Correct.");
                System.out.println("You May Proceed.");
                while (true) {
                    System.out.println("The Atm Provides Below Operations.");
                    System.out.println("1 Balance check.\n2 Deposit.\n3 Withdraw.\n4 Exit.");
                    System.out.println("Proceeding With Operation");
                    String operation = sc.nextLine();
                    if (operation.contains("1")) {
                        atmoperation.viewBalance();
                    } else if (operation.contains("2")) {
                        System.out.println("Enter The Amount:");
                        Double amount = sc.nextDouble();
                        sc.nextLine();
                        atmoperation.deposit(amount);
                    } else if (operation.contains("3")) {
                        System.out.println("Enter The Amount:");
                        Double amount = sc.nextDouble();
                        sc.nextLine();
                        atmoperation.withdraw(amount);
                    } else if (operation.contains("4")) {
                        System.out.println("Thank You:)");
                        return;
                    }
                }
            } else {
                System.out.println("Incorrect Pin,Please Try Again:(");
            }
        }
    }
}