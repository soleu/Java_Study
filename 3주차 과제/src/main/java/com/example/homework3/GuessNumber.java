package com.example.homework3;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = (int) (Math.random() * 100 + 1);//1~100
        int cnt = 1;

        while (true) {
            System.out.print("정답을 추측하여 보시오 : ");
            int input = sc.nextInt();
            if (input == number) break;
            else if (input < number) {
                System.out.println("제시한 정수가 높습니다.");
            } else {
                System.out.println("제시한 정수가 낮습니다.");
            }
            cnt++;
        }
        System.out.println("축하합니다. 시도횟수 = " + cnt);
    }

}
