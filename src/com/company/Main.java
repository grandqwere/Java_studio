package com.company;

import java.util.Arrays;
import java.util.List;
public class Main {


    public static void main(String[] args) {
        // write your code here
        Man Andrey = new Man();
        Man Konst = new Man();
        Woman Sweta = new Woman();

        Andrey.setName("Андрей");
        Konst.setName("Костя");
        Sweta.setName("Света");


        Human [] mas_human = new Human [] {Andrey,Konst,Sweta};
        Man [] mas_man = new Man [] {Andrey,Konst};


        for (Human i : mas_human) {
            i.voice();
        }


        //System.out.println(Sweta.equals(Andrey));


    }
}