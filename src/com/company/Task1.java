package com.company;

import java.util.Scanner;

public class Task1 {

    public static int multiplesOf3or5(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println ("Введите число: ");
        int number1 = s.nextInt();
        System.out.println(multiplesOf3or5(number1));
    }
}
