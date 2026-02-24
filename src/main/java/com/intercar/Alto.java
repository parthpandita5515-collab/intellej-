package com.intercar;

import java.util.SortedMap;

public class Alto implements CAR{

    @Override
    public void acceleration() {
        System.out.println("120");

    }

    @Override
    public void handbrake() {
        System.out.println("4-lever");

    }

    @Override
    public void brake() {
        System.out.println("disk");

    }

    @Override
    public boolean IsBackCar() {
        System.out.println("");
        return false;
    }

    @Override
    public void gears() {
        CAR.super.gears();
    }
}
