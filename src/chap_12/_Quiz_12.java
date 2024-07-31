package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {

        Runnable ready1 = new Runnable(){
          public void run(){
              for (int i = 1; i <= 5; i++) {
                  System.out.println("A 상품 준비" + i + " /5");
              }
              System.out.println(" -- A 상품 준비 완료 --");
          }
        };

        Runnable ready2 = () -> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("B 상품 준비" + i + " /5");
                }
            System.out.println(" -- B 상품 준비 완료 --");
        };

        Thread thread1 = new Thread(ready1);
        Thread thread2 = new Thread(ready2);

        thread1.start();
        thread2.start();

        //join과 같은 효과
        //while(thread1.isAlive() || thread2.isAlive()){
            
        //}
        
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Runnable set = () -> {
            System.out.println(" == 세트 상품 포장 시작 ==");
            for (int i = 1; i <= 5; i++) {
                System.out.println("세트 상품 포장 " + i + "/5");
            }
            System.out.println(" == 세트 상품 포장 완료 ==");
        };

        Thread set1 = new Thread(set);
        set1.start();
    }

}
