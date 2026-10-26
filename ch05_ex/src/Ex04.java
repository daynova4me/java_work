import java.util.Scanner;

public class Ex04 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //시간 H와 분 M을 입력받아 45분 전 시각을 출력
        //- H(0~23), M(0~59) 을 각각 입력받는다
        //- 45분을 빼되, 분이 음수가 되면 시간도 1 감소
        //- 시가 음수가 되면 23시로 처리 (자정 처리)
        System.out.println("시간을 입력하세요 : ");
        int H = scanner.nextInt();
        System.out.println("분을 입력하세요 : ");
        int M = scanner.nextInt() -45;
        //M : 입력값에 -45
        if (M < 0) {
            //만약 M이 음수라면 무조건 H도 -1이 된다.
            int hour = H - 1;
            int minute = 60 + M;
            // 60+(-M)
            // 입력값 - 45하면 분이 0(60분)을 향하게 되기 때문.
            if (hour < 0) {
                System.out.println(24 + hour + " " + minute);
            } else {
                System.out.println(hour + " " + minute);
            }
        }else {
                System.out.println(H + " " + M);
            }
        }
    }