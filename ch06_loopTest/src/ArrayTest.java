public class ArrayTest {
    static void main(String[] args) {
        // 배열 변수 선언하기, 배열이름을 복수형
        int[] scores = {75, 80, 50, 35};
        // 3번째 값 출력 : 50
        System.out.println("3번째 배열 내용 : " + scores[2]);
        // 2번째 배열의 값을 0 으로 변경 후에 출력
        scores[1] = 0;
        System.out.println("2번째 배열 내용 : " + scores[1]);
        // 전체 배열 내용 순회하면서 출력
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        // 문자 배열 만들기
        String[] members = {"장재규", "최도영", "임태양"};
        // 배열의 인덱스와 값을 같이 처리할 때 사용.
        for (int i = 0; i < members.length; i++) {
            if (i < members.length -1) {
                System.out.printf(members[i] + ", ");
            } else {
                System.out.printf(members[i]);
            }
        }
       // System.out.println(members[3]);
        // OutOfBound Exception(배열의 범위를 벗어난 인덱스 요청할 때)

        //Advanced-For(향상된 for 구문)
        // 배열 안에 요소들만 필요할 때 사용.
        for (String name : members){
            System.out.println(name);
            // 하나 꺼내서 출력하고 올라가고(장재규 출력하고 for) 또 하나 꺼내서 출력(최도영 출력 for)
            // 임태양까지 출력하면 더 이상 배열이 없으니 종료.
        }
    }
}
