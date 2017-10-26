package com.company;

public class Task2 {
    public static void main(String a[]){   // Вариант 1
        String binary = "0001";
        String binary1= "0010";
        String binary2= "0101";
        String binary3= "1001";
        Integer b = Integer.parseInt(binary,2);
        Integer c = Integer.parseInt(binary1,2);
        Integer d = Integer.parseInt(binary2,2);
        Integer e = Integer.parseInt(binary3,2);
        System.out.println("0001 ===> " +b);
        System.out.println("0010 ===> " +c);
        System.out.println("0101 ===> " +d);
        System.out.println("1001 ===> " +e);
    }


}
