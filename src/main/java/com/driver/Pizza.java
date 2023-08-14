package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    public int base_price;
    public int extraCheese;
    public int extraToppings;
    public int paperbag;
    boolean isCheeseadded;
    boolean isToppingsadded;
    boolean istakeawayadded;
    boolean isgetbill;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.extraCheese = 80;
        this.paperbag = 20;
        if(isVeg)
        {
            this.base_price = 300;
            this.extraToppings = 70;
        }
        else {
            this.base_price = 400;
            this.extraToppings = 120;
        }
        this.price = base_price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here.
        if(!isCheeseadded)
        {
            this.price += extraCheese;
            isCheeseadded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here.
        if(!isToppingsadded)
        {
            this.price += extraToppings;
            isToppingsadded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here.
        if(!istakeawayadded)
        {
            this.price += paperbag;
            istakeawayadded = true;
        }
    }

    public String getBill(){
        // your code goes here.
        if(!isgetbill)
        {
            this.bill = "Base Price Of The Pizza: " + this.base_price + "\n";
            if(isCheeseadded)
            {
                this.bill = this.bill + "Extra Cheese Added: " + this.extraCheese + "\n";
            }
            if(isToppingsadded)
            {
                this.bill = this.bill + "Extra Toppings Added: " + this.extraToppings + "\n";
            }
            if(istakeawayadded)
            {
                this.bill = this.bill + "Paperbag Added: " + this.paperbag + "\n";
            }
            this.bill = this.bill + "Total Price: " + this.price + "\n";
            isgetbill = true;
        }
        return this.bill;
    }
}
