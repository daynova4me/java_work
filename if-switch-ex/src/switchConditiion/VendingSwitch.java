package switchConditiion;

import java.util.Scanner;

public class VendingSwitch {
    static void main(String[] args) {
        //1. scanner 생성
        int coffee = 1500;
        int juice = 1000;
        int water = 500;
        int money = 1700;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //2. 화면에 메뉴 출력
            System.out.println("===================");
            System.out.println("메뉴번호를 선택하세요.");
            System.out.println("1. 커피(1500원)");
            System.out.println("2. 주스(1500원)");
            System.out.println("3. 물(1500원)");
            System.out.println("4. 종료");
            System.out.println("===================");
            System.out.println("번호 입력 : ");
            //3. 메뉴번호 입력받기
            int menu = scanner.nextInt();
            //4. 메뉴별로 처리
            switch (menu) {
                case 1:
                    System.out.println("커피 나옴");
                    System.out.println("잔액 반환: "+ (money - coffee) + "원");
                    break;
                case 2:
                    System.out.println("주스 나옴");
                    System.out.println("잔액 반환: "+ (money - juice) + "원");
                    break;
                case 3:
                    System.out.println("물 나옴");
                    System.out.println("잔액 반환: "+ (money - water) + "원");
                    break;
                case 4:
                    System.out.println("종료 합니다.");
                    return;
                default:
                    System.out.println("잘 못 선택했습니다.");
            }
        }
    }
}
