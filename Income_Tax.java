package com.company;
import java.util.Scanner;

public class Income_Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pacakage =sc.nextInt();
        if(pacakage>250000 && pacakage<500000){
            System.out.print("You have to pay : ");
            int pay =(pacakage*5)/100;
            System.out.println(pay);
        }
        else if (pacakage>=500000 && pacakage<1000000){
            System.out.print("You have to pay : ");
            int pay =(pacakage*20)/100;
            System.out.println(pay);
        }
        else if(pacakage>=1000000){
            System.out.print("You have to pay: ");
            int pay =(pacakage*30)/100;
            System.out.println(pay);        }
        else {
            System.out.println("don't pay anything you are poor ");
       }
}
}
