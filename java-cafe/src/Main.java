import cafe.Cafe;

public class Main {
    static void main(String[] args) {
        //## STEP 3. 첫 손님
        //
        //- 손님 정보를 알맞은 자료형으로 저장하세요.
        //    - 이름 `"김자바"`, 나이 `20`, 회원 여부 `true`, 등급 `'S'`,
        //    지갑 `20000`원, 스탬프 `8`개, 함께 온 친구 `0`명
        System.out.println("=====" + Cafe.CAFE_NAME + "=====");
        String name = "김자바";
        int age = 20;
        boolean vip = true;
        String level = "S";
        int wallet = 20000;
        int stemp = 8;
        int friend = 0;
        System.out.println("고객: " + name + " / 나이: " + age + " / 회원 여부: " + vip + " / 등급: " + level);

        // ## STEP 4. 주문번호 받기
        //
        //- 주문번호 기계의 현재 번호는 `200`입니다.
        //- 손님은 **현재 번호를 받고, 기계의 번호는 1 증가**합니다. 이 과정을 한 줄로 작성하세요.
        //- 손님의 주문번호와 다음 주문번호를 출력하세요.
        //- 주문번호가 짝수면 `"픽업대 A"`, 홀수면 `"픽업대 B"`로 안내하세요.
        int number = 200;
        int next = number+1;
        System.out.println("내 주문번호: " + number + ", 다음 주문번호: " + next);
        System.out.println("안내: " + (number %2 == 0? "픽업대 A에서 받아가세요" : "픽업대 B에서 받아가세요"));

//        ## STEP 5. 주문하기
//
//- 아메리카노(4,500원) 2잔과 케이크(6,800원) 1개를 주문합니다.
//- 주문 수와 판매 잔 수를 늘리고, 주문 금액을 계산하세요.
        int americano = 4500 * 2;
        int cake = 6800 * 1;
        int total = americano + cake;
        int order = Cafe.orderCount+1;
        int cup = Cafe.cupCount+=2;
        System.out.println("주문 금액: " + total);

        //## STEP 6. 할인과 결제
        //
        //- 회원이면 할인율만큼 할인하고, 아니면 할인하지 않습니다. 원 단위 미만은 버립니다.
        //- 결제 금액을 지갑에서 빼고, 남은 돈을 거스름돈으로 출력하세요.
       double sale = vip ? Cafe.SALE_RATE : 0;
        int totalA = (int) (total * sale);
        System.out.println("할인 금액: " + totalA);
        int outMoney = total - totalA;
        System.out.println("결제 금액: " + outMoney);
        System.out.println("거스름돈: " +(wallet - outMoney));

        // ## STEP 7. 거스름돈 내주기
        //
        //거스름돈을 **천원권, 오백원, 백원, 십원으로
        // 몇 개씩 줄 수 있는지 계산하고, 남은 금액도 출력하세요.
        int overMoney = wallet - outMoney;
        int thousand = overMoney / 1000;
        int fhundred = overMoney % 1000 / 500;
        int hundred = overMoney % 1000 % 500 / 100;
        int ten = overMoney % 1000 % 500 % 100 / 10;
        int any = overMoney % 1000 % 500 % 100 % 10;
        System.out.println("천원권: " + thousand + "장, 오백원: " + fhundred + "개, 백원: " + hundred + "개, 십원: " + ten + "개, 남은 금액: " + any);


// ## STEP 8. 스탬프와 쿠폰
//
//- 아메리카노 1잔당 스탬프를 1개씩 적립하세요.
//- **무료 음료 쿠폰**: 회원이고 스탬프가 10개 이상인 경우
//- **더치페이 대상**: 함께 온 친구가 0명이 아니고, 결제 금액을 친구 수로 나눈 값이 5,000원 이상인 경우
//    - 친구가 0명인데도 **0으로 나누기 에러가 나지 않는 이유**를 주석으로 설명하세요.
        int stempA = americano / 4500;
        int instemp = stemp + stempA;
        System.out.println("스탬프: " + instemp + "개");
        boolean free = vip? true : false;
        boolean freeA = instemp >= 10? true : false;
        boolean result = free && freeA;
     System.out.println("무료 음료 쿠폰: "+ result);
     boolean together = friend != 0? true : false;
     boolean pay = outMoney / (double)friend >= 5000 ? true : false;
     boolean boolResult = together && pay;
        System.out.println("더치페이 대상: " + boolResult);
        //친구 수가 0인 경우 나누기를 할 때 0 앞에 double을 붙입니다.

        //## STEP 9. 두 번째 손님
        //
        //두 번째 손님이 아메리카노 1잔을 주문했습니다. **오늘의 주문 수와 판매 잔 수**를 출력하세요.
        int finishOrder = order +1;
        int finishCup = cup + 1;
        System.out.println("오늘의 주문: " + finishOrder + "건, 판매 잔 수: " + finishCup + "잔") ;
    }
}
