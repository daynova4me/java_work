import java.util.Arrays;

public class ArraysEx {
    static void main(String[] args) {
        // scores 배열 선언 : 값으로 85, 92, 78, 95, 88, 90 만들기
        int [] scores= {85, 92, 78, 95, 88, 90};

        // scores 배열의 값을 하나씩 for 루프를 이용해서 출력.
        for (int i : scores) {
            System.out.println(i);
        }
        // scores 배열 전체를 한방에 출력하기.
        System.out.println(Arrays.toString(scores));
        // scores를 넣으면 [I@f6f4d33가 나옴.
        // [I@f6f4d33 : 객체(클래스)를 식별하는 값.
        // -> 이 scores라는 애가 무슨 애인데?라고 묻는 것.

        //가장 큰 값 찾기
        int max = Arrays.stream(scores).max().orElse( 0);
        System.out.println("가장 큰 값 : " + max);

        //배열을 정렬해 보기
        Arrays.sort(scores); //원본을 직접 수정해서 정렬 -> 원본 수정
        System.out.println("오름차순 정렬 후 : " + Arrays.toString(scores));
        //위에서 부터 쭉쭉 출력하다가 Arrays.sort를 만나니 정렬이 되어 출력되는 것.

        //일반적으로 객체가 갖는 기능
// 정렬, 찾기, 가장 큰 값, 작은 값, 출력V, 복사V
// 배열 복사V
// 새로운 배열 선언하고 거기에 복사V
        int[] copyScores = Arrays.copyOf(scores, scores.length);
        // 복사한 배열을 출력V
        System.out.println(Arrays.toString(copyScores));
    }
}