import java.util.Scanner;

public class Ex03 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //사용자에게 시험 점수를 입력받아 등급을 출력하는 프로그램
        //- 90 ~ 100점 → A
        //- 80 ~ 89점 → B
        //- 70 ~ 79점 → C
        //- 60 ~ 69점 → D
        //- 0 ~ 59점 → F
        System.out.println("시험 점수 : ");
        int score = scanner.nextInt();
        String result;
        if (score >= 90) {
            result = ("A");
        } else if(score > 80) {
            result = ("B");
        } else if(score >=70) {
            result = ("C");
        } else if(score >= 60) {
            result = ("D");
        } else {
            result = ("F");
        }
        System.out.println(result);
        }
    }
