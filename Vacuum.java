package com.rebecca;

public class Vacuum extends Product implements Waranty {
    int powerOfAspiration;

    public Vacuum(String name, double price, String category, int powerOfAspiration) {
        super(name, price, category);
        this.powerOfAspiration = powerOfAspiration;
    }

    public int getPowerOfAspiration() {
        return powerOfAspiration;
    }
    public void setPowerOfAspiration(int powerOfAspiration) {
        this.powerOfAspiration = powerOfAspiration;
    }

    @Override
    public void sale(double percentage) {
        double sale = getPrice() * percentage / 100;
        setPrice(getPrice() - sale);
    }

    @Override
    public void sale(double sum, boolean fixed) {
        if(fixed) setPrice(getPrice()-sum);
    }

    @Override
    public double calculateWaranty() {
        return 12;
    }
}
