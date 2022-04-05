package com.example.homework_4;

public class RollTheDiceMain {
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        int cnt = 0;
        while (true) {
            if (dice1.getValue() == 1 && dice2.getValue() == 1) break;
            dice1.roll();
            dice2.roll();
            System.out.println("주사위1= " + dice1.getValue() + " 주사위2= " + dice2.getValue() + "\n");
            cnt++;
        }
        System.out.println("(1, 1)이 나오는데 걸린 횟수= " + cnt);

    }
}
