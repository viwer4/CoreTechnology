package com.xmzedu.static_;

public class StaticMethod {
    public static void main(String[] args) {
        //
        Stu tom = new Stu("tom");
        Stu.payFee(300);

        Stu mary = new Stu("mary");
        mary.payFee(100);
        //System.out.println(Stu.fee);
        //
        tom.showFee();
    }
}

class Stu {
    private String name;

    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    public static void payFee(double fee) {
        Stu.fee += fee;
    }
    public static void showFee() {
        System.out.println("总学费有：" + Stu.fee);
    }
}
