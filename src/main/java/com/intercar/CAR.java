package com.intercar;

public interface CAR {
//    non implemented
    public void acceleration();
    public void handbrake();
    public void brake();
    public boolean IsBackCar();
//    implemented
    default void gears() {
        System.out.println("5");
     }
}