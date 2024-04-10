package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true )
        {
            price=300;
        }else{
            price=400;
        }

    }

    public Pizza(int price, String bill) {
        this.price = price;
        this.bill = bill;
    }



    public void addExtraCheese(){
        
        // your code goes here
        price+=80;
    }

    public int getPrice() {
        return price;
    }

    public void addExtraToppings(){
        // your code goes here
        price+=70;
    }

    public void addTakeaway(){
        // your code goes here
        price+=20;
    }

    public String getBill(){
        // your code goes here
        this.bill=Integer.toString(price);
        return this.bill;
    }
}
