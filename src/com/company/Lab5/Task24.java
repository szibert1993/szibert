package com.company.Lab5;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x, y;
        x = s.nextDouble();
        y = s.nextDouble();
        if ((x >= 2 && y >= 1) || (x >= 2 && y <= -1.5)) {
            System.out.printf("Точка с координатами (%.1f, %.1f) принадлежит множеству", x, y);
        } else {
            System.out.printf("Точка с координатами (%.1f, %.1f) не принадлежит множеству", x, y);
        }
    }
}
