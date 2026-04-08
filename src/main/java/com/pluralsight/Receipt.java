package com.pluralsight;

public class Receipt {

    public static void main(String[] args) {

        String itemName = "Fairlife shake";
        double itemPrice = 3.99;
        int numOfItems = 2;

        System.out.println("You bought " + numOfItems + " of " + itemName + " for " + "$" + (itemPrice * numOfItems));

    }
}
