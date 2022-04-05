package com.example.homework_4.RollTheDice;

public class Dice {
    private int face; //주사위 면

    public void roll() {
        int newFace = (int) (Math.random() * 6) + 1; //1~6
        setValue(newFace);
    }

    public int getValue() {
        return face;
    }

    public void setValue(int face) {
        this.face = face;
    }

    public Dice() {
        face = 0;
    }
}
