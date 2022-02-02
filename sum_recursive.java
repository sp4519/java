package com.company;

import java.util.Scanner;

public class sum_recursive {
    public static int recurSum(int n)
    {
        if (n <= 1)
            return n;
        return n + recurSum(n - 1);
    }

    // Driver code
    public static void main(String args[])
    {
        int n = 30;
        System.out.println(recurSum(n));
    }
}