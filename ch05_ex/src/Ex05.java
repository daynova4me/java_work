import java.util.Scanner;

public class Ex05 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 현재 시각(H시 M분)과 요리 시간(C분)을 입력받아
        // 완료 시각을 출력하시오.
        //- H(0~23), M(0~59), C(0~1000) 입력
        //- 분이 60 이상이 되면 시간 올림 처리
        //- 23시 59분 + 1분 = 0시 0분 (24시간 순환)
        System.out.println("현재 시간(시)을 입력하세요: ");
        int H = scanner.nextInt();
        System.out.println("현재 시간(분)을 입력하세요: ");
        int M = scanner.nextInt();
        System.out.println("요리 시간(분)을 입력하세요: ");
        int C = scanner.nextInt();
        if (M+C > 60) {
            int hour = H + 1;
            int minute = M + C;
            if (hour == 24) {
                System.out.println(0 + " " + (minute - 60));
            } else {
                System.out.println(hour + " " + (minute - 60));
            }
        } else {
            System.out.println(H + " " + (M+C));
        }
    }
}
