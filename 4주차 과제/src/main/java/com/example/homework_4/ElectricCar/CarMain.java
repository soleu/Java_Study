package com.example.homework_4.ElectricCar;

import java.util.Scanner;

public class CarMain {
    static final int DISTANCE = 1;
    static final int BATTERY = 2;
    static final int DRIVE = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ECar car = ECar.getInstance();
        int input;

        while (true) {
            if(car.getBattery()<=0) {
                System.out.println("배터리가 없습니다.");
                break;
            }
            showMenu();
            input = sc.nextInt();

            switch (input) {
                case DISTANCE:
                    car.dispDistance();
                    break;
                case BATTERY:
                    car.dispBattery();
                    break;
                case DRIVE:
                    car.drive();
                    break;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다.");
            }
        }
    }
    static void showMenu(){
        System.out.println("=========MENU=========");
        System.out.println("1. 주행거리 확인");
        System.out.println("2. 배터리 확인");
        System.out.println("3. 주행");
        System.out.println("======================");
        System.out.print("입력 : ");
    }
}