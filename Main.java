package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        System.out.println("Enter the number of subjects");
        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        System.out.println("enter sub 2 marks");
        int sub2 =sc.nextInt();
        System.out.println("enter sub 3 marks");
        int sub3 =sc.nextInt();
        System.out.println("enter sub 4 marks");
        int sub4 =sc.nextInt();
        System.out.println("enter sub 5 marks");
        int sub5 =sc.nextInt();
        int sum = sub1 +sub2 +sub3 +sub4 +sub5;
        float percentag = (sum/500)*100;
        System.out.println(percentag);
    }
}