import java.util.Scanner;

public class Ex07 {
    static void main(String[] args) {
        // 두 수를 입력받아서 두 수 사이의 값을 모두 더한다.
        // 1. 스캐너 달기
        Scanner scanner = new Scanner(System.in);

        //2. 두 수를 입력 받기. (a, b)
        System.out.println("첫 번째 수 입력: ");
        int a = scanner.nextInt();
        System.out.println("두 번째 수 입력: ");
        int b = scanner.nextInt();
        //3. 두 수를 비교해 a > b : 두 수 바꾸기.
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
            //두 수 바꾸는 방법.
        }
        //4. for loop로 누적합 계산.
        int sum = 0;
        // a = 3, b = 7
        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }
        //5. 결과 출력.
        System.out.println("결과 : " + sum);
    }
}
