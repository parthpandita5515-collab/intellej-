package org.example;

import java.util.Scanner;

public class PaaaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        Parre parre=new Parre();
        parre.Parre(num1,num2);
    }
}