package com.company;
import java.util.*;
public class Item {
    private String[] item = new String[2];
    public Item(){
        item[0] = "Posion";
    }
    public String getPotion(int i){
        return item[i];
    }

}
