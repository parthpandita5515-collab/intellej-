package com.lop;

public class SnCtloop {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++){
            if (i==125) {
                break;
            }
            if (i==120){
                continue;
            }
                System.out.println(i);
        }
    }
}
