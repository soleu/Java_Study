package com.example.homework3;

import java.util.Scanner;

public class makeMinusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("정수를 입력하시오 : ");
            int input = sc.nextInt();
            if (input == -1) break;
            sum += input;
        }
        System.out.println("정수의 합은 " + sum + "입니다.");
    }
}
