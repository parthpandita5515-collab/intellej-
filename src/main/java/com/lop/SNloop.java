package com.lop;

public class SNloop {
    public static void main(String[] args) {
        for (int i=0; i<100;i++){
            if (i==40){
                    continue;
            }
            if (i == 33) {
                continue;
            }
            System.out.println(i);

        }
    }
}
