package com.Atm;

public class AtmOperation {
    Atm atm = new Atm();

    public Double viewBalance() {
        System.out.println("The balance is" + atm.getViewbalance());
        if (atm.getViewbalance() == null) {
            atm.setViewbalance(Double.valueOf(0));
        }
        return atm.getViewbalance();
    }

    public void deposit(Double amount) {
        if (atm.getViewbalance() == null) {
            atm.setViewbalance(Double.valueOf(0));
        }
        atm.setViewbalance(atm.getViewbalance() + amount);
    }

    public void withdraw(Double amount) {
        if (atm.getViewbalance() == null) {
            atm.setViewbalance(Double.valueOf(0));
        }
        atm.setViewbalance(atm.getViewbalance() - amount);
    }
    public void exit(Double amount) {
        if (atm.getViewbalance() == null) {
            atm.setViewbalance(Double.valueOf(0));
        }
        atm.setViewbalance(atm.getViewbalance());
    }
}