package com.company;

import java.util.ArrayList;

public class Item {

    private int itemId;
    private String name;
    String detail;
    private int amount;

    public Item(int itemId,String itemName,int amountItemFound) {
        this.itemId = itemId;
        this.name = itemName;
        this.amount=amountItemFound ;
    }
    public int getAmount(){
        return amount;
    }
    public String getName(){
        return name;
    }
}
