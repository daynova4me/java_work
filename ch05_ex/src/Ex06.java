import java.util.Scanner;

public class Ex06 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 주사위 3개의 눈을 입력받아 상금을 계산하시오.
        //- 세 눈이 모두 같으면: 10,000 + 같은 눈 × 1,000원
        //- 두 눈이 같으면: 1,000 + 같은 눈 × 100원
        //- 모두 다르면: 가장 큰 눈 × 100원
        System.out.println("주사위 1: ");
        int one = scanner.nextInt();
        System.out.println("주사위 2: ");
        int two = scanner.nextInt();
        System.out.println("주사위 3: ");
        int three = scanner.nextInt();
        if (one == two) {
            int second = one = two;
            if (second == three) {
                int all = second = three;
                System.out.println("상금 : " + 10000 + all * 1000);
            } else {
                System.out.println("상금 : " + 1000 + second * 100);
            }
        } else if (one == three) {
            int side = one = three;
            System.out.println("상금 : " + 1000 + side * 100);
        } else if (two == three) {
            int back = two = three;
            System.out.println("상금 : " + 1000 + back * 100);
        } else {
            if (one > two) {
                if (one > three) {
                    System.out.println("상금 : " + one * 100);
                }
                if (one < three) {
                    System.out.println("상금 : " + three * 100);
                }
            } else if (two > three) {
                System.out.println("상금 : " + two * 100);
            } else {
                System.out.println("상금 : " + three * 100);
            }

        }
        }
            }
