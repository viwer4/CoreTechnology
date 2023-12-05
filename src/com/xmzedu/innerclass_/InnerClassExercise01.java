package com.xmzedu.innerclass_;

import com.xmzedu.abstract_.AA;

public class InnerClassExercise01 {
    public static void main(String[] args) {

        //当做实参直接传递 匿名内部类
        //f1(实参);方法（实参）
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("匿名内部类当做实参直接传递 嘿嘿嘿。。。");
            }
        });
        //传统的方法
        f1(new P());
    }

    //静态方法,形参是接口类型
    public static void f1(IL il) {
        il.show();
    }
}

interface IL {
    void show();
}
//类 实现IL
class P implements IL {

    @Override
    public void show() {
        System.out.println("传统的方法 嘿嘿嘿。。。");
    }
}
