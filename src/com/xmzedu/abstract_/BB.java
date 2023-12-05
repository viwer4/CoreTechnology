package com.xmzedu.abstract_;

public class BB extends Template{


    public void job() {

        long num = 0;
        for (int i = 0; i < 10000000; i++) {
            num += i;
        }
    }
}
