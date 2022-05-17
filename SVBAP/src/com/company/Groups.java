package com.company;

public class BudgetSuperclass {
    // Instance Vars
    private int credits = 1000;
    protected int area = 1688;
    private int pollution = 0;
    private int happiness = 0;
    private int peopleServed = 0;

    public BudgetSuperclass() { // TODO: Add additional roads and bridges
        credits -= 500;
        area -= 800;
        pollution += 75;
        happiness = 0;
    }

    public void reset() {
        credits = 1000;
        area = 1688;
        pollution = 0;
        happiness = 0;
        peopleServed = 0;
    }
}
