package com.learning;

public class Main {
    public static void main(String[] args) {
        PiggyBank piggy = new PiggyBank("น้องพอใจ");
        piggy.showMoney();
        piggy.addMoney(20);
        piggy.addMoney(50);
        piggy.showMoney();
    }
}
