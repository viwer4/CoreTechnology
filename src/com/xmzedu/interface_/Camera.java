package com.xmzedu.interface_;

public class Camera implements UsbInterface{
    @Override
    public void start() {
        System.out.println("Camera start...");
    }

    @Override
    public void stop() {
        System.out.println("Camera end...");
    }
}
