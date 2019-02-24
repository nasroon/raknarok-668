package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args){
        String name;
        int select;
        boolean event = true;
        Novice player1 = new Novice();
        Bag bag = new Bag();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name :");
        name = in.next();


        System.out.println("Welcome to RAGNAROK online :"+name);

        while (event==true) {
            System.out.println("==========================");
            System.out.println("1 . STATUS");
            System.out.println("2 . HIT MONSTER");
            System.out.println("3 . INVENTORY");
            System.out.println("4 . Rest");
            System.out.println("5 . End game  or another");
            System.out.println("==========================");
            // event bar
            Scanner in1 = new Scanner(System.in);
            System.out.println("Enter Event");
            select = in1.nextInt();
            //Condition
            if(select == 1){
                player1.status(name); //Status bar
            }
            else if(select == 2){
               player1.hitMonster(bag); //Hit monster to earn exp and get first time gift
            }

            else if (select == 3){
                if (bag.empty() == true)
                {
                    System.out.println("Your bag is empty");
                }
                else
                {
                    bag.showItem();
                }
            }
            else if (select == 4){
                player1.regenHp(player1.getMaxHp()); // regen HP to maxHP
            }
            else{
                event = false; //End Program
            }
        }

    }
}