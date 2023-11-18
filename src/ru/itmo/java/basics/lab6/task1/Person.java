package ru.itmo.java.basics.lab6.task1;

public abstract class Person {
    private String name;
    private String surname;

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    abstract void info();
}
