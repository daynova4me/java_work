public class ArrayBasic {
    static void main(String[] args) {
        // 배열 선언.
        //1. 정수형
        //배열 변수를 선언함과 동시에 초기화하는 방법.
        int[] scores = {85, 92, 78, 95, 88, 90};
        //베얄의 크기만 정하고 초기화 하기.
        int[] values = new int[6];
        System.out.println("values의 0번 째 : " + values[0]);
        // 6번째 가리키는 게 아닌 6개를 생성하는 것이라고 알리는 것.(~index 5)
        // 배열의 공간만 만들어 주는 것.
        //각각에 0까지 넣어주며 초기화 해주는 것.
        // new = 객체 생성.
        //int는 객체가 아니기에 출력하면 0이 나옴.

        //2. 문자열 배열
        String[] members = {"한일호", "최도준", "안일주"};
        //배열 공간만 미리 만들기
        String[] team = new String[5]; //5개의 문자열 배열만 선언한 것.
        //객체(대문자로 시작하고 기능이 있는 것 ex.String)의 초기값은 공백이 아님.
        // 모든 객체의 초기값: null 값을 갖는다.
        // team의 첫 번째에 있는 요소 출력
        System.out.println("team 첫 번째 : " + team[0]);
        if (team[0] == null) {
            System.out.println("같다");
        } else {
            System.out.println("같지 않다.");
        }
        // 그냥 team[0]을 출력하면 null(초기값)이 나옴.
        // 있는데 태어나지 않은 존재이기 때문에 ""(공백)과 같은 존재가 아님.

        //3. 실수형
        double[] data = {0.2, 1.3, 3.1};
        System.out.println(data[1]);

        // members 배열의 길이 출력
        System.out.println("members 배열의 길이 : " + members.length);
        //.을 했을 때 ()가 있는 것들은 어떠한 동작을 하는 것.
        // ()가 없으면 값을 구하는 것.
        //ex. 도하루.키 / 도하루.먹어요()
        //method(java) = function(java script)
        // -> 어떠한 기능을 가지고 있는 것들.
    }
}
