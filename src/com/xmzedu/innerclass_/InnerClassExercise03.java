package com.xmzedu.innerclass_;

public class InnerClassExercise03 {
}

class Test {
    public Test() {
        Inner s1 = new Inner();
        s1.a = 10;
        System.out.println("s1中a的大小 " + s1.a);
        Inner s2 = new Inner();
        System.out.println("s2中a的大小 " + s2.a);
    }
    class Inner {
        public int a = 5;
    }
    public static void main(String[] args) {
        Test t = new Test();
        Inner r = t.new Inner();
        System.out.println(r.a);
    }
}
