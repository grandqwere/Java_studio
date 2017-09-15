package com.company;

public class Man extends Human{


    {
        sex="мужской";
    }

    public Man(String name){
        super(name);
        famil = "";
    }

    Man(String name, String famil){
        this(name);
        super.famil = famil;
    }

    private setSex(){
        super.setSex("мужской");
    }



    //public void setName (String newName){
    //    name = newName;
    //}



}
