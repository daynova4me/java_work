package com.basic;

public class BasicOperator {
    static void main(String[] args) {
//        1. 산술연산자 : +, - ,*, /, %
//        % => 나머지를 구하는 연산자
        int a = 10;
        int b = 4;
        int addAB = a + b;
        System.out.println("a + b = " + (addAB));
        double devideAB = (double)a / b;
        System.out.println("a / b =" + devideAB);
        int modAB = a % b;
        System.out.println("10 % 4 = " + (modAB));
//        형변환(double) : 없이 쓰면 정수로 들어가지만 굳이 실수(소수)까지 넣어야 겠으면 쓰기)
//        =type casting
//        2. 관계연산자 : >, <, >=, <=, !=
//        != : 같지 않다.
        // 관계연산의 결과는 항상 논리값(true or fale)이다.(큰지 아닌지에 대한 비교값)
        // 관계연산은 주로 if 구문 안에서 사용된다.
        boolean result = a > b;
        System.out.println("a < b : " + result);

        result = (a != b);
        System.out.println("a != b : " + result);
//        한 번 선언한 것(result)을 아래쪽에 다시 하려면 명령어 안 쓴다.(덮어쓰기)

//        3. 논리연산자 : and : &&, or : ||, not : !
        // 논리값과 논리값의 연산
        boolean boolA = true;
        boolean boolB = false;
        boolean boolResult;
        boolResult = boolA || boolB;
        System.out.println("결과 : " + boolResult);
//        and : 둘 다 참이면 참
//        or : 하나만 참이여도 참

//        4. 대입 연산자
        int x = 10;
        System.out.println("x = " + x);
//        x에 1을 더하기
        x = x + 1;
        System.out.println("x = " + x);
//        x에 1 더하기
        x+=1; //x = x + 1;
        System.out.println("x = " + x);
        //x에서 특정 값 빼기(3 빼기)
        x = x - 3; //x -=3;
        System.out.println("x = " + x);
//        5. 삼항연산자
//        조건식? 참 : 거짓;
//        점수(score)가 60점 이상이면 "합격", 아니하면 "불합격"
        int score = 61;
//        정식버전
        if(score >= 60) {
//            참인 문장
            System.out.println("합격");
        } else {
                //거짓인 문장
                System.out.println("불합격");
            }

//        삼항연산 사용
        System.out.println(score >= 60? "합격" : "불합격");
        }
}
