package com.company;

public class Swordman extends Novice {
    public Swordman(){
    }
    public void print(){
        System.out.println("Congratulations your Class changing to Swordman");
    }
    public void skill(double at,double mg){
        attackDamage = at * 2;
        magicDamage = mg * 0.5;
    }
}
