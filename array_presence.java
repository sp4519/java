package com.company;

import java.util.Scanner;

public class array_presence {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        int arr[] = {23, 54, 3, 4, 43, 89};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            int k = arr[i];
            if (k==n) {
                System.out.println("Yes it is there");
            }
            else {
                System.out.println("this is not here");
            }
        }


    }
}
