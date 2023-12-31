package org.lessons.java.shop;

import java.math.BigDecimal;
public class Shop {
    public static void main(String[] args) {

        // Creo il nuovo Prodotto
        Product pasta = new Product("Fusilli", "Pasta Corta", new BigDecimal("2.99"), new BigDecimal("0.22"));
        System.out.println("Name " + pasta.getName());
        System.out.println("Code: " + pasta.getPaddedCode());
        System.out.println("Name + Code: " + pasta.completeName());
        System.out.println("Description: " + pasta.getDescription());
        System.out.println("Price: " + pasta.getPrice() + " €");
        System.out.println("Vat: " + pasta.getVat() + " %");
        System.out.println("Vat + Price: " + pasta.vatPrice() + " €");

    }
}
