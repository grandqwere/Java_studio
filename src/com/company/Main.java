package com.company;

import java.util.Arrays;
import java.util.List;
public class Main {


    public static void main(String[] args) {
        // write your code here
        People Andrey = new People();
        People Konst = new People();
        People Sweta = new People();

        Andrey.setName("Андрей");
        Konst.setName("Костя");
        Sweta.setName("Света");

        People [] mas = new People [] {Andrey,Konst,Sweta};
        List<People> mas2 = Arrays.asList(Andrey,Konst,Sweta);

        //mas[1].setName("Андрей");
        //System.out.println(mas[1].getName());

        mas2.forEach(f -> System.out.println(f.getName()));

        for (People i : mas) {
            System.out.println(i.getName());
        }



    }
}