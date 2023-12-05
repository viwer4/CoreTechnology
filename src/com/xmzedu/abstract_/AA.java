package com.xmzedu.abstract_;

public class AA extends Template{

    public void job() {

        long num = 0;
        for (int i = 0; i < 80000; i++) {
            num *= i;
        }
    }
}
