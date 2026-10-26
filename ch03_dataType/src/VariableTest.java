public class VariableTest {
    // 변수의 종류는 정수, 실수, 문자열, 부울 타입
// 정수 : int(4bite, 20억), long(8bite, 20억 이상)
    //변수는 숫자/특수문자/예약어로 시작 안 함.
// 실수 : double(8bite)
// 참거짓(부울타입) : boolean(true/false)
// 소문자로 시작하는 데이터 타입 : primitive type(원시타입:값만 생각하는 애들)
// 문자: : String
    static void main(String[] args) {
        int age = 23;
        int weight = 45;
        long myNumber = 1000000;
        double height = 171.5;
        boolean isDebut = true;
        String name = "안유진";
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height + "cm");
        System.out.println("데뷔 : " + isDebut);
        System.out.println("월급 : " + myNumber + "원");
}
}