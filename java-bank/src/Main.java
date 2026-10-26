import bank.Bank;

public class Main {
    static void main(String[] args) {
        System.out.println("=====" + Bank.BANK_NAME + "====="
        ); //제목
        int g = Bank.guestCount+1; //고객번호
        final String name = "홍길동"; //고객 이름
        int age = 25; //고객 나이
        boolean VIP = false; // VIP 상황
        String level = "B"; // 등급
        int balance = 0; // 잔액
        int salary = 0; // 월급
        System.out.println("고객번호: " + g + " / "+"이름: " + name + " / " + "나이: " + age + " / " + "등급: " + level);

        int number = 100; // 현재 번호
        int nextNumber = number+1; // 다음 번호
        System.out.println("내 번호표: " + number + ", " + "다음 대기 번호: " + nextNumber);
        System.out.println("안내: " + (number%2 == 0? "1번 창구" : "2번 창구") + "로 오세요."); // 창구구분

        int plus = balance+50000; //입금
        int minus = 12500; //출금
        int lastBalance = plus - minus; //남은 잔액
        int lastfee = VIP == true? 0 : Bank.FEE; // 수수료 적용 여부 확인
        int finalBalance = lastBalance - lastfee; // 수수료 적용 잔액
        Bank.workCount++; //거래 건수
        System.out.println("입금 후 잔액: " + plus);
        System.out.println("출금 후 수수료: " + (lastfee));
        System.out.println("출금 후 잔액: " + finalBalance);

        int bonus = (int) (finalBalance * Bank.BONUS_RATE); //이자
        Bank.workCount++; //거래 건수
        System.out.println("이자: " + bonus);
        System.out.println("이자 지급 후 잔액: " + (finalBalance + bonus)); // 이자 지급 후 잔액

        int endBalance = finalBalance + bonus; // 이자 지급 후 잔액
        boolean ageNumber = age >=19? true : false; // 나이 제한
        boolean balanceNumber = endBalance >= 30000? true : false; // 잔액 제한
        boolean boolResult;
        boolResult = ageNumber && balanceNumber; // t/f 구분
        System.out.println("대출 가능 여부: " + boolResult);
        boolean endSalary = salary != 0? true : false; // 월급 제한
        boolean a = endBalance >= salary * 2? true : false; // 잔액이 월급의 2배 인가
        boolean b;
        b = endSalary && a;
        System.out.println("우대 대상 여부: " + b);

        int c = endBalance / 10000; // 만원권
        int d = endBalance %10000 / 1000; // 천원권
        int e = endBalance %10000 % 1000 / 100; // 백원권
        int f = endBalance % 10000 % 1000 % 100; //남은 금액
        System.out.println("만원권 " + c + "장, " + "천원권 " + d + "장, " + "백원 " + e + "장, " + "남은 금액 " + f + "원");

        int h = g+1; //오늘 총 고객
       Bank.workCount++;// 거래 건수
        System.out.println("오늘의 총 고객 수: " + h + "명, " + "거래 건수: " + Bank.workCount + "건");
        int total = Integer.MAX_VALUE;
        System.out.println(total + 1);
    }
}
//## STEP 10. 🤔 팀장님의 추가 질문 (주석으로 답하기)
//
//1. `Bank.BONUS_RATE = 0.05;`를 실행하면 어떻게 될까요?
//이자가 1850이 되며 잔액이 38850이 됨.
//2. `int total = Integer.MAX_VALUE;`로 저장한 다음 `total + 1`을 출력하면 어떻게 될까요?
// -2147483648이 나옵니다.
// 어떻게 해결할 수 있을까요?

//3. `guestCount`를 static으로 선언하는 이유는 무엇일까요?
// 제시사항에 고객번호가 앞으로 나와있기 때문에 먼저 올라가게 하는 static을 사용하였습니다.