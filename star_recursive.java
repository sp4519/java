package com.company;

import java.util.Scanner;

public class star_recursive {
    static void star(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(); }
}
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc =new Scanner(System.in);

        int k = sc.nextInt();
        star(k);


    }
}
