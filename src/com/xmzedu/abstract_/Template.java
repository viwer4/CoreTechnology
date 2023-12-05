package com.xmzedu.abstract_;

abstract public class Template {

    public abstract void job();

    public void calculateTime() {
        //得到开始的时间
        long start = System.currentTimeMillis();
        long num = 0;
        job();
        //得到结束时间
        long end = System.currentTimeMillis();
        System.out.println("AA执行的时间为:" + (end - start));
    }
}
