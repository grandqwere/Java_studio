package com.company;

abstract class Human {

    private final static String ROD = "человек";
    private String sex;
    private String name, famil;

    Human (String name){
        this.name = name;
    };

    abstract void setSex();

    //У человека можно спросить имя
    public String getName (){
        return name;
    }

    //Человек должен говорить
    public void voice () {
        System.out.println("Я " + ROD + ", мой пол " + sex + ", меня зовут " + name + " " + famil);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;

        Human human = (Human) o;

        if (sex != null ? !sex.equals(human.sex) : human.sex != null) return false;
        return name != null ? name.equals(human.name) : human.name == null;
    }

    @Override
    public int hashCode() {
        int result = sex != null ? sex.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
