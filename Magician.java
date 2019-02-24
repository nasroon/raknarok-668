package com.company;

public class Magician extends Novice{
        public Magician(){

        }
        public void print(){
            System.out.println("Congratulations your Class changing to Magician");
        }
        public void skill(double at,double mg){
            attackDamage = at * 0.5;
            magicDamage = mg * 2;
        }
}
