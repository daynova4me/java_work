package ifCondition;

import java.util.Scanner;

public class MenuSelect {
    static void main(String[] args) {
        int coffeePrice = 1500;
        int juicePrice = 1000;
        int waterPrice = 500;
        Scanner scanner = new Scanner(System.in);
        //투입 금액 출력
        System.out.println("투입 금액 : ");
        //투입 금액 입력
        int money = scanner.nextInt();
        //금액 비교
        String result;
        if (money >= coffeePrice) {
            result = ("커피, 주스, 물 모두 구매 가능합니다.");
        } else if (money >= juicePrice) {
            result = ("주스, 물 구매 가능합니다.");
        }else if (money >= waterPrice) {
            result = ("물만 구매 가능합니다.");
        }else {
            result = ("잔액이 부족합니다.");
        }
        System.out.println(result);
    }
}
