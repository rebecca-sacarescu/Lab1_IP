package com.rebecca;

public class Client extends User {
    double budget;

    public Client(String name, String email, String password, double budget) {
        super(name, email, password, budget);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public void display() {
        System.out.println("Budget: " + budget);
    }
}
