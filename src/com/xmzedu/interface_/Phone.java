package com.xmzedu.interface_;

//
public class Phone implements UsbInterface{

    @Override
    public void start() {
        System.out.println("Phone start...");
    }

    @Override
    public void stop() {
        System.out.println("Phone end...");
    }
}
