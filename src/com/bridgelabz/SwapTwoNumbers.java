package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        b = sc.nextInt();
        int t = 0;
        // Taking 1 additional variable t to swap
        t = a;
        a = b;
        b = t;
        // Without any additional variable
//        a = a + b;
//        b = a - b;
//        a = a - b;
        System.out.println("The swap value of a is : " + a);
        System.out.println("The swap value of b is : " + b);
    }
}
