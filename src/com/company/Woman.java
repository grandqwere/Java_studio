package com.company;

public class Woman extends Human{


    public void voice () {
        System.out.println("Я " + ROD + ", мой пол " + sex + ", меня зовут " + name);
    }

    public String getName (){
        return name;
    }

    public void setName (String newName){
        name = newName;
        setSex();
    }

    void setSex(){
        sex = "женский";
    }

}
