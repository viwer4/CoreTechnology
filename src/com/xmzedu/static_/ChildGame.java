package com.xmzedu.static_;

public class ChildGame {

    public static void main(String[] args) {

        Child child1 = new Child("jack");
        Child child2 = new Child("leo");
        Child child3 = new Child("hal");
    }
}

class Child {
    private String name;

    public Child(String name) {
        this.name = name;
    }
    public void join() {
        System.out.println(name + "join play");
    }
}
