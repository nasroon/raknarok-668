package com.company;
import java.util.*;
import java.io.*;
public class Bag {
    private int countPosion = 20;
    private Item item = new Item();

    public int usePosion(int index){
        if(countPosion != 0 && item.getPotion(index).equals("Posion")){
            countPosion--;
            return 20;
        }
        return 0;
    }
    public int showCountPosion(){
        return countPosion;
    }
}
