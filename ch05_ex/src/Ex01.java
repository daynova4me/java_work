import java.util.Scanner;

public class Ex01 {
    static void main(String[] args) {
        System.out.println("첫번째 수 입력: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("두번째 수 입력: ");
        int b = scanner.nextInt();
        int result;
        if (a > b) {
            result = (a);
        }else {
            result = (b);
        }
        System.out.println("큰 수: " + result);
        }
    }
