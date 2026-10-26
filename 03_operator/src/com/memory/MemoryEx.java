package com.memory;

public class MemoryEx {
    static int value = 50;
    int n2 = 100;
    //ex. {2{a=1}}이 있으면 2는 a=1을 건드릴 수 있지만 a=1은 2를 건드릴 수 없다.

    static void add(){
       // ()가지고 있으니 add는 함수.
//    void -> 나는 너한테 줄 거 없어.

        int n1 = 1;
        System.out.println("add함수의 n1 : " + n1);
        //System.out.println("밖에 있는 n2 : " + n2); -> void의 자식도 아니고 따로 static이 있는 것도 아님.
        //n1은 static void의 자식이니 같이 올라감.
        if (true){
            int i = 10;
            System.out.println("i" + i);
        }
        if (true){
            int i = 10;
            System.out.println("i" + i);
        }
        // 변수가 같아도 한 집{}에 있는 게 아니니 오류 안 생김.(바깥이 우선)
    }

    static void main(String[] args) {
        System.out.println("value = " + MemoryEx.value); //속성(각각의 개체를 구분지을 수 있는 값)
        MemoryEx.add();
//        기울어져 있으면 static(선발, 먼저 올라가는 애)
//        ex. System.out -> System이라는 집에 out 이라는 아이.

        MemoryEx ex = new MemoryEx();
        System.out.println(ex.n2);
        ex.add();
    }
}
