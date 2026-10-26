import java.util.Scanner;

public class Ex02 {
    static void main(String[] args) {
        System.out.println("첫번째 수 입력: ");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        System.out.println("두번째 수 입력: ");
        int second = scanner.nextInt();
        System.out.println("a = " + first + " b= " + second);
        System.out.println("a = " + second + " b= " + first);
    }
}
