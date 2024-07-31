package chap_12;

import chap_12.clean.Room;

public class _05_Synchronization {
    public static void main(String[] args) {

        Room room = new Room();

        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("-- 직원1 청소 시작 --");
                for (int i = 1; i <= 5 ; i++) {
                    room.clean("작원1");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if(i == 2){
                        throw new RuntimeException("못해먹겠다!!");
                    }
                }
                System.out.println("-- 직원1 청소 끝 --");
            }
        };

        // 람다 형식
        Runnable cleaner2 = () -> {
            System.out.println("-- 직원2 청소 시작 --");
            for (int i = 1; i <= 5 ; i++) {
                room.clean("직원2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("-- 직원2 청소 끝 --");
        };

        Thread cleanThread1 = new Thread(cleaner1);
        Thread cleanThread2 = new Thread(cleaner2);

        cleanThread1.start();
        cleanThread2.start();
    }
}
