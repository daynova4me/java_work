package constant;

//package : 클래스의 위치를 나타낸 정보.
public class ConstEx {
    public static final String GROUP_NAME = "BTS";
    public static void main(String[] args) {
        //main도 public이 생략된 것.
        //public, private, 생략이 있는데 생략을 하면 다른 패키지에서는 안 보임.
        // 다른 패키지에서 사용하려면 앞에 public 쓰기.(상수든 main이든 뭐든지)

        final int MAX_MEMBER = 7; //BTS의 멤버 수
        //GROUP_NAME의 static 설정이 안 되는 이유
//        -> main이 static으로 설정되어 이미 ()로 닫혀있기 때문에
            // 어제 올라갔어야 할 놈이 오늘 올라오게 생겨서 오류가 생기는 것.
            // main 밖으로 내보내면 해결됨.
        // 실행 시점에서 읽혀지는 것 -> lazy loading
        String name = "김남준";
        name = "김석진";
        System.out.println("BTS 멤버 수 : " + MAX_MEMBER);
        System.out.println("그룹 이름 : " + ConstEx.GROUP_NAME);
    }
}
