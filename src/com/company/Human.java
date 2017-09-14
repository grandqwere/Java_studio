package com.company;

abstract class Human {

    protected final static String ROD = "HUMAN";

    //Человек должен говорить
    abstract void voice ();

    //Человека нужно назвать
    abstract void setName (String name);

    //У человека можно спросить имя
    abstract String getName ();

}
