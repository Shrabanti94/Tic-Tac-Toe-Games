package com.example.my_tic_tac_toe;

public class newfile {
    private String name;
    private int age;
    public int getAge() {
        return age;
    }
    newfile(){

    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("name: "+getName());
        System.out.println("age: "+getAge());
    }
}

