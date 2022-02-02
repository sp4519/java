package com.company;

import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1;i<11;i++){
            int table = n *i ;
            System.out.println(table);
        }
    }
}
