package check;

public class RandomNumber {
    static void main(String[] args) {
        //일반 수학관련 함수는 Math 클래스에 있음.
        //0.0 이상 1.0 미만 더블값(0.0 ~ 0.999...)
        double x = Math.random();
        System.out.println(x);
        //주사위 값 생성(1~6)
        int dice = (int)(Math.random()*6)+1;
        //(int)Math.random는 Math.random의 정수만 출력한다.는 소리.
        // 결론은 무조건 평생 0이 나온다는 것.
        // 주사위는 6인데 지금은 5가 Max이니 +1을 하여 6을 만들어줌.
        //그러니 Math.random을 6으로 곱하고 그걸 (int) 정수로 바꾼다.
        System.out.println(dice);
    }
}
