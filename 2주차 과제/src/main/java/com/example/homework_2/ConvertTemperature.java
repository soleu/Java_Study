package com.example.homework_2;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double F, C;

        System.out.println("============================");
        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("============================");

        System.out.print("번호를 선택하시오 : ");
        choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("화씨 온도를 입력하시오 : ");
            F = sc.nextDouble();
            C = (F - 32) / 1.8;
            System.out.print("섭씨 온도는 " + C);
        } else {
            System.out.print("섭씨 온도를 입력하시오 : ");
            C = sc.nextDouble();
            F = (1.8 * C) + 32;
            System.out.print("화씨 온도는 " + F);
        }
    }
}
