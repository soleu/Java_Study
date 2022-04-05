package com.example.homework3;

public class Diamond {
    public static void main(String[] args) {
        for (int k = 0; k < 5; k++) {
            for (int i = 4; i > k; i--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= k * 2 + 1; j++) {
                if (j == 1 || j == k * 2 + 1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int k = 3; k > -1; k--) {
            for (int i = k; i < 4; i++) {
                System.out.print(" ");
            }
            for (int j = k * 2 + 1; j > 0; j--) {
                if (j == k * 2 + 1 || j == 1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}
