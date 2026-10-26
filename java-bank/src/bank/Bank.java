package bank;

public class Bank {
    public static final String BANK_NAME = "자바은행";//은행이름
    public static final double BONUS_RATE = (double)5 / 100; //이자율
    public static final int FEE = 500; //수수료
    public static int guestCount = 0; //고객 번호
    public static int workCount = 0; // 거래 건수


    static void main(String[] args) {
        System.out.println(BONUS_RATE);
    }
}
