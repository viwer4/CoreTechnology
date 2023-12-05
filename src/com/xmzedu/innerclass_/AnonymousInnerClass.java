package com.xmzedu.innerclass_;

/**
 * 1.匿名内部类的使用
 * 原因
 * 想使用接口，必须创建一个类。若这个类只使用一次，可用匿名内部类简化开发。
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.method();
    }
}

class Outer01 {//外部类
    private int n1 = 10;
    public void method() {
        //基于接口的匿名内部类
        //1.jdk底层在创建匿名内部类 Outer01$1 ,立马创建了 Outer01$1 实例，
        // 并把地址返回给 tiger
        //2.匿名内部类使用一次，就不能被使用
        // (IA类只能创建tiger一个对象，不能创建多个了)
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("tiger is crying...");
            }
        };
        //getClass获取到tiger的运行类型
        System.out.println("tiger的运行类型：" + tiger.getClass());
        tiger.cry();
//        底层代码
//        class Outer01$1 implements IA {
//            @Override
//            public void cry() {
//                System.out.println("tiger is crying...");
//            }
//        }

        //e.g
        //* ("jack") 形参列表会传递给 构造器
        Father father = new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了Test方法");
            }
        };
        father.test();

        //基于抽象类的匿名内部类
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("抽象类Animal的方法eat被重写。。。");
            }
        };
    }
}
interface IA{//接口
    public void cry();
}
class Father {
    public Father(String name) {
    }
    public void test() {
    }
}

abstract class Animal {
    abstract void eat();
}
