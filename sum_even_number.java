package com.company;

import java.util.Scanner;

public class sum_even_number {
    public static void main(String[] args) {
        System.out.print("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0, num = 1;

        for(int count=1; count<=n; ){
            if(num%2 == 0){
                sum += num;
                count++;
            }
            num++;
        }

        System.out.println("Sum: "+sum);
    }

        }
