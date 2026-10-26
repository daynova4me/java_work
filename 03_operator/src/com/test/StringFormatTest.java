package com.test;

public class StringFormatTest {
    static void main(String[] args) {
        // 클래스(오브젝트) : 기능을 갖고 있는 것들.
        String name = "Yujin";
        int age = 20;
        int nameLength = name.length();
        System.out.println("이름 길이 : " + nameLength);
        String lowerCase = name.toLowerCase();
        System.out.println("이름 소문자 : " + lowerCase);

        String schoolName = "휴먼IT";
        String song = "학교 종이 땡땡땡" + schoolName + "어서 모이자";
        System.out.println(song);
//        x = x + 1;
        // \n : 개행문자(한 줄 건너뛰기), \t : tab 기능
        song = song + "\n선생님이 우리를 기다리신다";
        song = song + "\n\t노래끝";
        System.out.println(song);

        String textBlock = """
                밤거리의 갈 곳을 잃은 아이
                버릇처럼 널 불러
                Such a lonely night
                너에게로 가는 맘""";
        System.out.println(textBlock);
        //자바 공부할 때만 사용함(나중에는 사용 안 함)
        String memberInfo = """
                이름 : %s
                나이 : %d세
                """.formatted(name, age);
        // %s 의 s는 String 줄임 / %d는 나이
        System.out.println(memberInfo);
    }
}
