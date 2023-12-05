package com.xmzedu.interface_;

public class Interface01 {

    public static void main(String[] args) {
        //对象
        Camera camera = new Camera();
        Phone phone = new Phone();
        //computer
        Computer computer = new Computer();
        computer.work(phone);

        System.out.println("--------------------");

        computer.work(camera);
    }
}
