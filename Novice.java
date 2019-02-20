package com.company;
import java.util.Scanner;

public class Novice {
    private String name;
    private int hp;
    private double exp;
    private int money;
    private int lv;
    private int maxHp;
    public Novice(){
        hp = 500;
        maxHp = 100*1*5;
        exp = 1;
        money = 500;
        lv = 1;
    }
    public int getLv(){ return  lv; }
    public double getExp(){ return exp; }
    public int getHp(){ return hp; }
    public int getMoney(){ return money; }
    public int getMaxHp(){return maxHp;}
    public void status(){
        //status
        System.out.println("-----Your status-----");
        System.out.println("Lv    : "+ getLv());
        System.out.println("hp    : "+ getHp());
        System.out.println("exp   : "+ getExp());
        System.out.println("money : "+ getMoney() + "   Zeny.");
    }
    public void Shop(){
        System.out.println("Coming Soon!");
    }
    public void KeepLevel(){
        int event;
        Scanner in = new Scanner(System.in);
        System.out.println("Do you wont to figt with something (1 = yes , 0 = no)");
        event = in.nextInt();
        if(event == 1 ){
            int event1;
            System.out.println("What monster do you want to fight");
            System.out.println("1. Poring (Lv.1)");
            System.out.println("2. Lunatic (Lv.2)");
            System.out.println("3. Fabre (Lv.3)");
            System.out.println("4. Pupa (Lv.4)");
            System.out.println("5. Savage Babe (Lv.5)");
            Scanner in1 = new Scanner(System.in);
            System.out.print("Enter no. of monster : ");
            event1 = in1.nextInt();


            if(event1 == 1){ // Poring
                System.out.println("Congratulation !! you kill Poring ");
                System.out.println("Earn 32 Zeny");
                setMoney(32);
                System.out.println("Earn 7 exp");
                setExp(7);
                System.out.println("You can check you status in event board");
                setDamage(1);
            }
            else if(event1 == 2){ // Lunatic
                System.out.println("Congratulation !! you kill Poring ");
                System.out.println("Earn 32 Zeny");
                setMoney(32);
                System.out.println("Earn 18 exp");
                setExp(18);
                System.out.println("You can check you status in event board");
                setDamage(2);
            }
            else if(event1 == 3){ // Fabre
                System.out.println("Congratulation !! you kill Poring ");
                System.out.println("Earn 33 Zeny");
                setMoney(33);
                System.out.println("Earn 19 exp");
                setExp(19);
                System.out.println("You can check you status in event board");
                setDamage(3);
            }
            else if(event1 == 4){ // Pupa
                System.out.println("Congratulation !! you kill Poring ");
                System.out.println("Earn 33 Zeny");
                setMoney(33);
                System.out.println("Earn 1 exp");
                setExp(1);
                System.out.println("You can check you status in event board");
                setDamage(32);
            }
            else if(event1 == 5){ // Savage Babe
                System.out.println("Congratulation !! you kill Poring ");
                System.out.println("Earn 50 Zeny");
                setMoney(50);
                System.out.println("Earn 50 exp");
                setExp(50);
                System.out.println("You can check you status in event board");
                setDamage(50);
            }
        }
        else{
            // not figth
        }
    }
    public void setLv(double exp){
        double upExp;
        upExp = lv*0.5*100;
        if( exp >= upExp){
            this.exp = exp - upExp;
            lv = lv + 1;
            System.out.println("Congratulation !! Level you upping !!");
        }
    }
    public void setHp(int maxHp){
        hp = maxHp;
    }
    public void setExp(int earn){
        exp = exp + earn;
    }
    public void setMoney(int earn){
        money = money + earn;
    }
    public void setDamage(int damage){
        hp = hp - damage;
        if (hp <= 0){
            System.out.println("You die!!");
        }
    }
    public void incressHP(int plus){
        if(hp + plus < maxHp){
            this.hp += plus;
        }
        else if(hp + plus >= maxHp){
            this.hp += (maxHp - hp);
        }
    }
    Bag bag = new Bag();
    public void usePosion(int hp) {
            this.hp = bag.usePosion(0);
            incressHP(hp);
    }
}
