package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int size[] = new int[10];
        size[0] = 250;

        for (int i = 0; i < size.length - 1; i++) {
            size[i + 1] = size[i] + 5;
        }

        for (int i = 0; i < size.length; i++) {
            System.out.println("사이즈 " + size[i] + " (재고 있음)");
        }

//        for(int sizes :size){
//            System.out.println("사이즈 " + sizes + " (재고 있음)");
//        }
    }
}
