package com.xmzedu.static_;

public class VisitStatic {
    public static void main(String[] args) {
        //类名.类变量名
        //没有创建对象实例也可以访问
        System.out.println(A.name);
    }
}

class A {
    //类变量
    public static String name = "徐明之正在学Java哦";
}
