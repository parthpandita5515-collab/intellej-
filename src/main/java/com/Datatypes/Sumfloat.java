package com.Datatypes;

public class Sumfloat {
    public float no;
    public float no1;
    public float no2;

    public float getNo() {
        return no;
    }

    public void setNo(float no) {
        this.no = no;
    }

    public float getNo1() {
        return no1;
    }

    public void setNo1(float no1) {
        this.no1 = no1;
    }

    public float getNo2() {
        return no2;
    }

    public void setNo2(float no2) {
        this.no2 = no2;
    }
    public void no2 (float a , float b){
        this.no=a;
        this.no1=b;
        this.no2=no+no1;
        System.out.println(no2);
    }
}
