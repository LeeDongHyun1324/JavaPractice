package chap_12.clean;

public class Room {
    public int number = 1;

    public synchronized void clean(String name){   // 동기화 직원1이 와있다면 직원2가 못들어옴
        // 직원1 : 3번방 청소 완료
        System.out.println(name + " : " + number + "번방 청소 중");
        number++;
    }
}
