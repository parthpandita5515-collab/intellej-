package com.exchange;

import java.util.Scanner;

public class Scnnr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Swp swp = new Swp();
        swp.swap(a,b);
    }
}