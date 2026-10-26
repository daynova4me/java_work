package check;

import java.util.Arrays;
import java.util.Scanner;

public class juminCheck {
    static void main(String[] args) {
        //주민번호 13자리("-" 빼고) 입력받아
        // 배열에 쪼개서 저장하고 맞는지 확인하는 프로그램
        //1. 스캐너 달기
        Scanner scanner = new Scanner(System.in);
        //2. 주민번호 13자리 입력받기
        System.out.println("주민번호 입력(- 제외) : ");
                //split은 쪼개기 split의 ()는 무엇을 기준으로 쪼갤지 넣는 것.
        //3. 각 자릿수를 쪼개서 문자열 배열에 넣기.
        String[] data = scanner.next().split("");
        //출력
        System.out.println(Arrays.toString(data));

        //4. for 루프로 회전시키면서 문자 -> 숫자배열에 옮기기.
        //숫자로 변경해서 담을 새 배열 생성
        int[] juminNumber = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            //parsing(파싱) : 특정 값을 다른 값으로 변경하는 기능.
            juminNumber[i] = Integer.parseInt(data[i]);
        }
        //숫자배열을 출력
        System.out.println(Arrays.toString(juminNumber));
   }
}
