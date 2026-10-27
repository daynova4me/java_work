package ex;

import java.util.Arrays;

public class Ex03 {
    //**
    static void main(String[] args) {
        //주사위 2개 던져서 얻은 합의 확률 계산하기(36,000번 던짐)
        final int TOTAL_COUNT = 36000; //상수 선언할 때는 다 대문자.
        //COUNT[11] -> 주사위 2개의 합이 2~12일 때 총 카운트.
        // 주사위 1번 생성, 주사위 2번 생성.
        //주사위 1 + 2 -> 36000번.
        //index는 count와 2개 차이나서 10개.
        //총합이 3개가 나오면 index는 1번.

        //각 주사위 합 저장할 배열(2~12) : 11개
        //합이 2 -> 인덱스 0, 합 9 _> 인덱스 7 ...
        int[] count = new int[11];
        //36,000번 반복하면서 주사위 생성 후 누적
        for (int i = 1; i <= TOTAL_COUNT; i++) {
            //직접 값을 적는 것 보다 total_count를 적는 게 더 편함.
            //난수를 1~6 사이의 난수 2개를 생성
            int diceOne = (int) Math.random() * 6 + 1;
            int diceTwo = (int) Math.random() * 6 + 1;
            //합에 따른 누적할 배열의 색인값을 구한다.
            int location = diceOne + diceTwo - 2;
            count[location] = count[location] + 1;
            //합과 인덱스 번호가 -2 차이 나니까.
        }
        //결과 배열 출력
        //System.out.println(Arrays.toString(count));
        //결과 출력
        // 2 : 1026(0.028500)
        for (int i=0; i<count.length; i++) {
            System.out.printf(i + 2 + " : ");
            System.out.println(count[i] + "(" + (double)count[i] / TOTAL_COUNT + ")");
        }
    }
}
