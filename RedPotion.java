package com.company;

public class RedPotion extends Item{
    public RedPotion(int id,String RedPotion,int amount){
        super(id,RedPotion,amount);
    }
    public void print(){
        System.out.println("Red Potion is can regen your 'HP' 100   "+ getAmount());
    }
}