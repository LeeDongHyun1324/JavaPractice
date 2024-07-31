package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 5;   // 주차 시간

        boolean noNormal = false;
        boolean lightCar = false;
        int fee = hour * 4000;  //시간당 4천원 곱하기

        // 30000원 초과 시 일일 최대 요금으로 수정
        if (fee >30000) {
            fee = 30000;
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if (lightCar || noNormal) {
            fee /= 2;   //50% 할인 적용
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + "원입니다.");
    }
}
