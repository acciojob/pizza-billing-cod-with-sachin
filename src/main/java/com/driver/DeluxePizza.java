package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        setPrice(getPrice()+100);



    }


    @Override
    public void addExtraToppings(){
        setPrice(getPrice() + 120);
    }




// your code goes here



}
