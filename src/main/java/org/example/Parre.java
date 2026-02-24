package org.example;

public class Parre {
    private int num1;
    private  int num2;
    private  int sum;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return sum;
    }

    public void setNum3(int num3) {
        this.sum = num3;
    }
    public void Parre(int a,int b){
        this.num1=a;
        this.num2=b;
        this.sum=a+b;
        System.out.println(sum);

    }
}
