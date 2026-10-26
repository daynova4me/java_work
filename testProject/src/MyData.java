public class MyData {
//    ctrl + shift + enter = 줄바꿈
static void main(String[] args) {
//    간단한 축약어로 몸통을 만드는 것.
//    보일러 플레이트(boilerplate)
//    변수의 선언 : 타입 변수명 = 값;
    int age = 10;
    System.out.println("나이 : " + age + "살");
    long maxValue = 2200000000L;
    int maxvalue = 200;
//    값이 넘쳐난 경우 -> over floor
//    long 타입 데이터는 항상 뒤에 L 붙여야 한다.
//    long 타입에 20억 이하(int 값)을 넣어도 상관 없음(L 안 붙여도 됨)
//    단, 이러한 경우 long 을 써도 int로 인식함.
//    int, long, double, booelan -> 소문자로 작성(primitive type : 원시타입)
//    대문자로 시작하는 건 class
    System.out.println("max value :" + maxValue);
}
}
