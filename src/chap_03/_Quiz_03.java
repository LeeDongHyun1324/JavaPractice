package chap_03;
//"901231-1234567"인 경우 901231-1 까지 출력
//"030708-4567890"인 경우 030708-4 까지 출력
public class _Quiz_03 {
    public static void main(String[] args) {
        String s1 = "901231-1234567";
        String s2 = "030708-4567890";

        System.out.println(s1.substring(0,8));
        System.out.println(s2.substring(0, s2.indexOf("-") + 2));
    }
}
