package com.rebecca;

public class Main {
    public static void main(String[] args) {

        Telefon telefon = new Telefon("Samsung S21", 3500, "Electronice", "Android");
        Vacuum vacuum = new Vacuum("Dyson", 2500, "Electrocasnice", 185);
        Client client = new Client("Alin", "alinscob@gmail.com", "imiPlaceMuzica", 5000);


        System.out.println("Inainte de reducere:");
        System.out.println("Telefon: " + telefon.getName() + " - Pret: " + telefon.getPrice());
        System.out.println("Aspirator: " + vacuum.getName() + " - Pret: " + vacuum.getPrice());


        telefon.sale(1000, true);
        vacuum.sale(15);

        System.out.println("Dupa reducere:");
        System.out.println("Telefon: " + telefon.getName() + " - Pret: " + telefon.getPrice());
        System.out.println("Aspirator: " + vacuum.getName() + " - Pret: " + vacuum.getPrice());


        System.out.println("Garantie telefon: " + telefon.calculateWaranty() + " luni");
        System.out.println("Garantie aspirator: " + vacuum.calculateWaranty() + " luni");


        client.display();
        //System.out.println("Buget client: " + client.getBudget());
    }
}
