package com.datastructure.arrays.exercises;

import java.util.Scanner;

public class AvgTemperature {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How many days temperatures?");
        int noOfDays = console.nextInt();
        //for recording the temp
        int[] temps = new int[noOfDays];
        int sum = 0;
        for(int i = 0; i< noOfDays; i++){
            System.out.print("Day " +(i+1)+ "'s high temperature: ");
            temps[i]= console.nextInt();
            sum +=temps[i];
        }
        double avg = sum/noOfDays;      //Average temperature
        //count days above average
        int above = 0;
        for (int i=0;i< temps.length;i++){
            if (temps[i]>avg){
                above++;
            }
        }
        System.out.println();
        System.out.println("Avg temp = " +avg);
        System.out.println(above + "days above average");
    }
}
