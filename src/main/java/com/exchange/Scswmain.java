package com.exchange;

public class Scswmain {
    public int no;
    public int no1;
    public int no2;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getNo2() {
        return no2;
    }

    public void setNo2(int no2) {
        this.no2 = no2;
    }

    public int getNo1() {
        return no1;
    }

    public void setNo1(int no1) {
        this.no1 = no1;
    }

    public void swap ( int a , int b) {
        this.no = a + b;
        this.no1 = no - a;
        this.no2 = no - b;
        System.out.println(no1);
        System.out.println(no2);
    }
}
