package com.rebecca;

public class Telefon extends Product implements Waranty {
    private String operatingSystem;

    public Telefon(String name, double price, String category, String operatingSystem) {
        super(name, price, category);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void sale(double sum, boolean fixed) {
        if(fixed) setPrice(getPrice()-sum);
    }

    public void sale(double percentage) {
        double sale = getPrice() * percentage / 100;
        setPrice(getPrice() - sale);
    }


    @Override
    public double calculateWaranty() {
        return 36;
    }
}
