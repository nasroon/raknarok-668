package com.company;

import java.util.*;

public class Bag {

    private ArrayList<Item> items;


    public Bag() {
        items = new ArrayList<Item>();
    }

    public void addItem(){
        items.add(new Item(0,"RedPotion",5));
        items.add(new Item(1,"BluePotion",5));
    }
    public void Red(){
        Item r1 = new RedPotion(0,"RedPotion",1);
        items.add(r1);
    }

    public void Blue(){
        Item b1 = new BluePotion(1,"BluePotion",1);
        items.add(b1);
    }

    public void showItem(){
        int i =0;
        for (Item number : items) {
            System.out.println(items.get(i).getName()+ "   amount  " + items.get(i).getAmount());
            i++;
        }
    }
    public boolean empty(){
        return items.isEmpty();
    }
}