package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean cheeseAdded = false;
    private Boolean toppingsAdded = false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        // your code goes here
        if(isVeg==true )
        {
            price+=300;
        }else{
            price=400;
        }

    }
    public void addExtraCheese(){
        // your code goes here
        if(!cheeseAdded) {
            price += 80;
           cheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here

        if(!toppingsAdded) {
            price += 70;
       toppingsAdded=true;

        }

    }
    public void addTakeaway(){
        // your code goes here
        price+=20;
    }
    public String getBill(){
        // your code goes here
        bill=Integer.toString(price);
        return bill;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
