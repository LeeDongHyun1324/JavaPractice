package chap_02;

//키가115cm 이므로 탑승 불가능합니다.
//키가121cm 이므로 탑승 가능합니다.

public class _Quiz_02 {
    public static void main(String[] args) {
        int length1 = 115;
        int length2 = 121;

        String D1 = (length1 >= 120) ? "Yes" : "키가 " + length1 + "cm 이므로 탑승 불가능합니다.";
        String D2 = (length2 >= 120) ? "키가 " + length2 + "cm 이므로 탑승 가능합니다." : "No";

        System.out.println(D1);
        System.out.println(D2);
    }
}
