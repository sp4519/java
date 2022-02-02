package com.company;

public class array_sum {
    public static void main(String[] args) {
        float arr[] ={2.5f,4.9f,5.9f,8.8f};
        float sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];

        }
        System.out.println(sum);
    }
}
