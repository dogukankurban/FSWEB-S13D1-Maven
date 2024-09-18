package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("width girin");
        double width = scanner.nextDouble();
        System.out.println("heigth girin");
        double heigth = scanner.nextDouble();
        System.out.println("area of rectangle" + area(width,heigth));

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(clock < 0 || clock > 23 || !isBarking) {
            return false;
        }
        return clock >=20 || clock < 8;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if ((firstAge > 13 && firstAge <= 19) || (secondAge > 13 && secondAge <= 19) || (thirdAge > 13 && thirdAge <= 19)) {
            return true;
        } else {
            return false;
        }
    }



    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int lowestTemp = 25;
        int highestTemp = isSummer ? 45 : 36;

        if(temp<highestTemp && temp>lowestTemp) {
            return true;
        } else {
            return  false;
        }
    }

    public static double area(double width, double heigth) {
        if(width<0 || heigth<0) {
            System.out.println("width veya height 0'dan küçük olamaz");
            return -1;
        }
        return width*heigth;
    }
    public static double area(double radius) {
        if (radius<0) {
            System.out.println("radius 0'dan küçük olamaz");
            return -1;
        }
        return Math.PI*Math.pow(radius,2);
    }
}
