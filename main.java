package com.company;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String name;
        int damage,event;
        Novice noviceP1= new Novice();
        Bag bag = new Bag();


        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name Character : ");
        name = in.next();

        System.out.println("Welcome to Raknarok online : "+ name);
        while(true){
            System.out.println("====================");
            System.out.println("1 . Novice guide");
            System.out.println("2 . Status");
            System.out.println("3 . Shop");
            System.out.println("4 . Keep level");
            System.out.println("5 . Up level ");
            System.out.println("6 . Rest");
            System.out.println("7 . Use Posion");
            System.out.println("====================");
            Scanner in1 = new Scanner(System.in);
            System.out.print("Enter your event : ");
            event = in1.nextInt();
            if(event == 1){
                System.out.println("You can go to Dungeon when you level over 5 ");
                System.out.println("You can buy anything in shop");
                System.out.println("you can getting exp in event 4");
                System.out.println("You can upping your level in event 5");
                System.out.println("If you want to regen your hp you can go to event rest (6) ");
                System.out.println("In fist time you have get Posion for incress your Hp (7)");
            }
            else if(event == 2){
                noviceP1.status();
            }
            else if(event == 3){
                noviceP1.Shop();
            }
            else if(event == 4){
                noviceP1.KeepLevel();
            }
            else if(event == 5 ){
                noviceP1.setLv(noviceP1.getExp());
            }
            else if(event == 6){
                noviceP1.setHp(noviceP1.getMaxHp());
            }
            else if(event == 7){
                int inven;
                Scanner in2 = new Scanner(System.in);
                System.out.println("(1 = Inventory , 2 = use posion");
                inven = in2.nextInt();
                if(inven == 1){
                    System.out.println("Now you have posion "+noviceP1.bag.showCountPosion());
                }
                else if (inven == 2) {
                    noviceP1.usePosion(noviceP1.getHp());
                }
            }
        }
    }
}
