package com.company;

import java.util.Scanner;

public class if_else_pass_fail {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        System.out.println("Enter the marks for sub 1:");
        int sub1 = marks.nextInt();
        System.out.println("Enter the marks for sub 2:");
        int sub2 = marks.nextInt();
        System.out.println("Enter the marks for sub 3:");
        int sub3 = marks.nextInt();
        int totalmarks = sub1 +sub2 +sub3;
        int percentage = totalmarks/3;
        if(percentage > 40 && sub1>33 && sub2>33 && sub3>33){
            System.out.println("You are pass");
        }
        else{
            System.out.println("You are fail");
        }

    }
}
