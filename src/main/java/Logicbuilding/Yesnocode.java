package Logicbuilding;


import java.util.Scanner;

public class Yesnocode {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your name");
        String name= scanner.nextLine();
        Yesno yesno=new Yesno();
        yesno.yesno();


    }
}
