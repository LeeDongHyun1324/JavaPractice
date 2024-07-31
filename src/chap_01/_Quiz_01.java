package chap_01;
/*  출력 결과
상암08번 버스
약 3분 후 도착
남은 거리 1.2km
*/
public class _Quiz_01 {
    public static void main(String[] args) {
        // 버스 번호 (1234, 상암)
        String busNum = "상암08";

        // 남은 시간 (3분, 5분)
        int countDown = 3;

        // 남은 거리 (1.5km, 0.8km)
        double remainDistance = 1.2;

        // 결과 출력
        System.out.println(busNum + "번 버스");
        System.out.println("약 " + countDown + "분 후 도착");
        System.out.println("남은 거리 " + remainDistance + "km");
    }
}
