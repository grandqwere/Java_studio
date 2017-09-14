package com.company;

public class People extends Human{

    public String name;

    public void voice () {
        System.out.println("Я" + Human.ROD + ", меня зовут " + name);
    }

    public String getName (){
        return name;
    }

    public void setName (String newName){
        name = newName;
    }
}
