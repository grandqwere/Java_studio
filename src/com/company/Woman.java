package com.company;

public class Woman extends Human{

    {
        sex="женский";
    }

    public Woman (String name){
        super(name);
        famil = "";
    }

    public Woman (String name, String famil){
        this(name);
        super.famil = famil;
    }



}
