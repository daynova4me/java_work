package cafe;

public class Cafe {
    //이름	설명	값	변경 가능
    //CAFE_NAME	카페 이름	"자바카페"	❌
    //SALE_RATE	회원 할인율	0.1	❌
    //orderCount	오늘의 주문 수	0	⭕
    //cupCount	오늘 판매한 잔 수	0	⭕
    public final static String CAFE_NAME = "자바카페";
    public final static double SALE_RATE = 0.1;
    public static int orderCount = 0;
    public static int cupCount = 0;

    static void main(String[] args) {
        System.out.println(Cafe.SALE_RATE);
    }
}
