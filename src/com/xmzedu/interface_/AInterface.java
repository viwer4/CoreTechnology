package com.xmzedu.interface_;

public interface AInterface {
    //写属性
    public int n1 = 10;
    //写方法，可以省略abstract
    public void hi();
    //jdk8以后，可以有默认实现方法，需要default关键字修饰
    default public void ok() {
        System.out.println("ok...");
    }
    //jdk8以后，可以有默认实现方法，需要static关键字修饰
    public static void cry() {
        System.out.println("cry...");
    }
}
