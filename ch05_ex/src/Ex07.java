import java.util.Scanner;

public class Ex07 {
    static void main(String[] args) {
        int coffee = 1500;
        int juice = 1000;
        int water = 500;
        int money = 0;
        Scanner scanner = new Scanner(System.in);
        // 자판기 메뉴 프로그램을 작성하시오.
        //- 메뉴: 1.커피(1500원) 2.주스(1000원) 3.물(500원) 4.종료
        //- 초기 잔액: 0원
        //- 1번 선택 시: 투입 금액 입력 → 잔액에 추가
        //- 2번 선택 시: 음료 선택 후 잔액 차감 (잔액 부족 시 안내)
        //- 3번 선택 시: 현재 잔액 출력
        //- 4번 선택 시: 잔돈 반환 후 종료
        //> 힌트: `while(true)` + switch 표현식 조합으로 구현
        while (true) {
            System.out.println("===============");
            System.out.println("메뉴를 선택해 주세요.");
            System.out.println("1. 잔액 추가하기");
            System.out.println("2. 음료 선택하기");
            System.out.println("3. 현재 잔액 출력하기");
            System.out.println("4. 잔돈 반환 후 종료하기");
            System.out.println("===============");
            System.out.println("번호 입력: ");
            int menu = scanner.nextInt();
        switch (menu) {
            case 1:
                System.out.println("투입할 금액을 입력해주세요 : ");
                int inmoney = scanner.nextInt();
                System.out.println("투입 금액 : " + money + inmoney);
                break;
        }
        switch (menu) {
            case 2:
                System.out.println("음료를 선택해 주세요 : ");
                System.out.println("1. 커피 - 1500원");
                System.out.println("2. 주스 - 1000원");
                System.out.println("3. 물 - 500원");
                int drink = scanner.nextInt();
                switch (drink) {
                    case 1:
                        int incoffee = money - coffee;
                        System.out.println("커피 선택" + (incoffee));
                        if (coffee > money) {
                            System.out.println("잔액이 부족합니다.");
                        }
                    case 2:
                        int injuice = money - juice;
                        System.out.println("주스 선택" + (money - juice));
                        if (juice > money) {
                            System.out.println("잔액이 부족합니다.");
                                }
                    case 3:
                        int inwater = money - water;
                        System.out.println("물 선택" + (money - water));
                        if (water > money) {
                            System.out.println("잔액이 부족합니다.");
                        }
                        break;
                }
        }
        switch (menu) {
            case 3 :
                System.out.println("현재 잔액을 출력합니다.");
                System.out.println(money);
                break;
        }
            System.out.println("종료합니다.");
        }
    }
}
