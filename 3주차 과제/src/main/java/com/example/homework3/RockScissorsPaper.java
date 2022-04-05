package com.example.homework3;

import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {
    final int SCISSOR = 0;
    final int ROCK = 1;
    final int PAPER = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("가위(0), 바위(1), 보(2): ");
        int choice = sc.nextInt();

        int computer = (int) (Math.random() * 3);//0~2

        if(choice==computer){
            System.out.println("인간과 컴퓨터가 비겼음");
        }
        else if(choice==(computer+1)%3){
            System.out.println("인간 : " + choice + " 컴퓨터 : " + computer + "\t인간 승리");
        }else{

            System.out.println("인간 : " + choice + " 컴퓨터 : " + computer + "\t컴퓨터 승리");
        }
    }
}
