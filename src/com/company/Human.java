package com.company;

abstract class Human {

    protected final static String ROD = "человек";
    protected String sex;
    protected String name;

    //Человек должен говорить
    abstract void voice ();

    //выбор пола
    abstract void setSex();

    //Человека нужно назвать
    abstract void setName (String name);

    //У человека можно спросить имя
    abstract String getName ();

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
