package ifCondition;

import java.util.Scanner;

public class ScannerEx {
    static void main(String[] args) {
        //스캐너 구입
        Scanner sc = new Scanner(System.in);
        String name;
        // ⓜ : method - 기능을 수행, 함수(function)
        System.out.println("이름을 입력하세요");
        name = sc.next();
        System.out.println("입력한 이름은 : " + name);
        int age;
        System.out.println("나이를 입력하세요(0 ~ 120 정수만..)");
        age = sc.nextInt();
        System.out.println("입력한 나이는 : " + age);
        //키를 입력(단, 실수로 입력 받기)
        System.out.println("키를 입력하세요(소숫점 포함)");
        double height = sc.nextDouble();
        System.out.println("입력한 키는 : " + height);
    }
}
