package com.company;

import java.util.Scanner;

public class percentage {

        public static void main(String[] args)
        {
            System.out.println("Enter the number of subjects");
            Scanner sc = new Scanner(System.in);
            float sub1 = sc.nextFloat();
            System.out.println("enter sub 2 marks");
            float sub2 =sc.nextFloat();
            System.out.println("enter sub 3 marks");
            float sub3 =sc.nextFloat();
            System.out.println("enter sub 4 marks");
            float sub4 =sc.nextFloat();
            System.out.println("enter sub 5 marks");
            float sub5 =sc.nextFloat();
            float sum = sub1 +sub2 +sub3 +sub4 +sub5;
            float percentag = (sum/500)*100;
            System.out.print(percentag);
            System.out.print("%");

        }
    }
