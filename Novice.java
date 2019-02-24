package com.company;

import java.util.Random;
import java.util.Scanner;

public class Novice {
    protected int hp;
    protected double attackDamage;
    protected double magicDamage;
        private int maxHp,lv,sp;
        private double exp;
        private String Class;


    public Novice(){
            Class  = "Novice";
            hp = 100;
            sp = 100;
            lv = 1;
            maxHp = lv*100;
            exp = 0;
        attackDamage = 10;
        magicDamage = 10;
        }
        public void status(String name){
            System.out.println("Name :"+name);
            System.out.println("Class :" + Class);
            System.out.println("Level :"+getLv());
            System.out.println("Exp :"+getExp());
            System.out.println("Hp :" + getHp() + "/" + getMaxHp());
            System.out.println("SP :"+ getSp());
            System.out.println("Attack Damage " + getAttackDamage() + "Magic Damage"+ getMagicDamage());
        }
        public double getAttackDamage(){return attackDamage;}
        public double getMagicDamage(){return magicDamage;}
        public int getLv(){return lv;}
        public double getExp(){return exp;}
        public int getHp(){return hp;}
        public int getSp(){return sp;}
        public int getMaxHp(){return maxHp;}
        public void setExp(int earn){
            exp = exp + earn;
        }
        public void regenHp(int maxHp){
            hp = maxHp;
            sp = maxHp;
            System.out.println("Your HP and SP Will be Regen");
        }
        public void setDamage(int damage){
            hp = hp-damage;
            if(hp <= 0 ){
                System.out.println("YOU DIE !");
                System.out.println("Please rest");
            }
        }
        public void setSp(int decrease){
            sp = sp - decrease;
        }
        public void hitMonster(Bag bag){
            if(lv == 1 && exp == 0){
                bag.addItem();
                System.out.println("Congratulations you get  5 of Red Potion and  5 of Blue Potion");
            }
            setExp(150);
            setDamage(50);
            setSp(10);
            setLv(exp);

            Random rand = new Random();
            int value = rand.nextInt(5);  // Can get Red Potion if random is 0 and Blue Potion is 1 another don't get anything
            if (value == 0){
                bag.Red();
                System.out.println("You get Red Potion 1");
            }
            else if(value == 1){
                bag.Blue();
                System.out.println("You get Blue Potion 1");
            }
        }
        public void changeClass(){
            int event;
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Class do you want (1 . Magician , 2 . Swordman ) :" );
            event = in.nextInt();
            if(event == 1){
                Magician magician = new Magician();
                magician.print();
                Class = "Magician";
                magician.skill(attackDamage,magicDamage);
            }
            else if(event == 2){
                Swordman swordman = new Swordman();
                swordman.print();
                Class = "Swordman";
                swordman.skill(attackDamage,magicDamage);
            }
        }
        public void changeHpAndSp(){
            this.hp = 100 *lv;
            this.maxHp = hp;
            this.sp = hp;
        }
        public void setLv(double exp){
            int levelUp;
            levelUp = lv*100;
            if(exp >= levelUp){
                this.exp = exp - levelUp;
                lv = lv + 1;
                System.out.println("Congratulations !! You level up");
                changeHpAndSp();
                if(lv == 5 ){
                    System.out.println("Congratulations you can select new Class");
                    changeClass();
                }
            }
        }
}
