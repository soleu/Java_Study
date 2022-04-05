package com.example.homework_2;

import java.util.Scanner;

public class convertType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sec;
        System.out.print("초를 입력하시오 : ");
        sec = sc.nextInt();

        System.out.println(sec + "초는 " + sec / 60 + "분 " + sec % 60 + "초입니다.");
    }
}
