package chap_12;

public class _04_MultiThread {
    public static void main(String[] args) {

        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("-- 직원1 청소 시작 --");
                for (int i = 1; i <= 10 ; i += 2) {
                    System.out.println("(직원1)" + i + "번방 청소 중 ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("-- 직원1 청소 끝 --");
            }
        };

        // 람다 형식
        Runnable cleaner2 = () -> {
            System.out.println("-- 직원2 청소 시작 --");
            for (int i = 2; i <= 10 ; i += 2) {
                System.out.println("(직원2)" + i + "번방 청소 중 ");
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
