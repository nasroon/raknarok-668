package com.company;

public class BluePotion extends Item{
    public BluePotion(int id,String BluePosion,int amount){
        super(id,BluePosion,amount);
    }
    public void print(){
        System.out.println("Blue Potion is can regen your 'SP' 100  "+getAmount());
    }
}
