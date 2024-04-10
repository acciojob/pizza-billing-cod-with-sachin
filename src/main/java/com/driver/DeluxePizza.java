package com.driver;

public class DeluxePizza extends Pizza {

    private int totalBill=0;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        if (isVeg == true) {

            totalBill += getPrice();
        }

    }



        // your code goes here



}
