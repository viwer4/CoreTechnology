package com.xmzedu.interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LitterMonkey wuKong = new LitterMonkey("悟空");
        wuKong.climbing();
        wuKong.swimming();
    }
}

class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println(name + " 会爬树...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

interface Fishable {
    void swimming();
}

class LitterMonkey extends Monkey implements Fishable{

    public LitterMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + " 通过学习 可以像鱼儿一样游泳...");
    }
}
