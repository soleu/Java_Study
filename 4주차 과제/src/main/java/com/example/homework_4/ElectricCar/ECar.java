package com.example.homework_4.ElectricCar;

public class ECar {

    private int battery;
    private int distance;

    ECar() {
        battery = 100;
        distance = 0;
    }

    public static ECar getInstance() {
        return new ECar();
    }

    public void dispDistance() {
        System.out.println("주행 거리 : " + distance + "km");
    }

    public void dispBattery() {
        System.out.println("배터리 : " + battery + "%");
    }

    public int getBattery() {
        return battery;
    }

    public void drive() {
        battery -= 10;
        distance += 1;
        System.out.println("차를 주행합니다.=3=3");
    }
}
