import chat.ChatRoom;
import constant.ConstEx;

public class Main {
    static void main(String[] args) {
        System.out.println("그룹 이름 : " + ConstEx.GROUP_NAME);
        // 두 명의 메모장 = 일반변수(직역변수)
        int hyunseulMemo = 0;
        int taehoonMemo = 0;
        //태훈의 메모값을 + 1
        taehoonMemo++;
        System.out.println("현슬 메모값 : " + hyunseulMemo);
        System.out.println("태훈 메모값 : " + taehoonMemo);

        //단톡방 인원 3명 들어옴.
        ChatRoom.memberCount++;
        ChatRoom.memberCount = ChatRoom.memberCount + 1;
        ChatRoom.memberCount+=1;
        System.out.println(ChatRoom.ROOM_NAME + ", 인원 : " + ChatRoom.memberCount + "명");
    }
}
