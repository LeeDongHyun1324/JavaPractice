package chap_01;
// 변수 이름 짓는 법
public class _05_VariableNaming {
    // 1. 저장할 값에 어울리는 이름
    // 2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능 (공백 사용 불가)
    // 3. 밑줄 또는 문자로 시작 가능
    // 4. 한 단어 또는 2개 이상 단어의 연속
    // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
    // 6. 예약어 사용 불가 (public, static, void, int, double, float ...)

    // 입국 신고서 (여행)
    // 두번째 단어부턴 대문자
    String nationality = "대한민국"; // 국적
    String firstName = "현성"; //이름
    String lastName = "김"; //성
    String dateOfBrith = "2001-12-31"; // 생년월일
    String residentialAddress = "무슨 호텔"; // 체류지
    String purposeOfVisit = "관광"; // 입국목적

    //밑줄 외에는 불가
    String flightNo = "KE657"; //항공 편명
    String _flightNo = "KE657"; // 밑줄 시작
    String flight_no_2 = "KE657"; // 밑줄과 숫자 포함
    // String -flightNo = "KE657; 불가


    int accompany = 2; //동반 가족 수
    int lengthOfStay = 5; //체류 기간

    // 숫자가 앞에 나오면 불가
    String item1 = "시계";
    String item2 = "가방";
//    String 3item = "전자제품";

    // 절대 변하지 않는 상수는 대문자로
    // final 예약어는 수정할 수 없음
    final String CODE = "KR";
//    CODE = "US";
}
