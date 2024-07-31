package chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int x){
        int result = x * x;
        return result;
    }

    public static int getPowerByExp(int x, int exponent){
        int result = 1;;
        for (int i = 0; i < exponent; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        //전달 값과 반환 값이 있는 메소드
        int retVal = getPower(2);
        System.out.println(retVal); //2 * 2 = 4;

        retVal = getPower(3);
        System.out.println(retVal); // 3 * 3 = 9;

        retVal = getPowerByExp(3, 3);
        System.out.println(retVal); // 3 * 3 * 3 = 27

        System.out.println(getPowerByExp(2, 4));    //2 * 2 * 2 * 2 * 2 = 16
    }
}
