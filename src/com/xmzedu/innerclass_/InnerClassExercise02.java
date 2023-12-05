package com.xmzedu.innerclass_;

public class InnerClassExercise02 {
    public static void main(String[] args) {

        CellPone cellPone = new CellPone();
        cellPone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("wake up>>");
            }
        });

        cellPone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("learn<<");
            }
        });
    }
}

interface Bell {
    void ring();
}
class CellPone {
    public void alarmclock(Bell bell) {
        bell.ring();
    }
}
