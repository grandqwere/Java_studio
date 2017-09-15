package com.company;

import java.util.Arrays;
import java.util.List;



public class Main {


    public static void main(String[] args) {
        // write your code here
        Man Andrey = new Man("Андрей", "Гранковский");
        Man Konst = new Man("Костя");
        Woman Sweta = new Woman("Света");


        Human [] mas_human = new Human [] {Andrey,Konst,Sweta};
        Man [] mas_man = new Man [] {Andrey,Konst};


        Andrey.name = "qwe";

        for (Human i : mas_human) {
            i.voice();
        }

    }


}