package com.datastructure.arrays.twodimensional;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDArrayOps {

    int arr[][]= null;

    //Constructor
    public TwoDArrayOps(int numberOfRows, int numberOfColumns){
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr.length; column++){
                arr[row][column] = Integer.MIN_VALUE;
            }
        }
    }

    //TODO : Inserting value in 2-D Array
    public void insertValue(int row, int col, int value){
        try {
            if (arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = value;
                System.out.println("The value is successfully inserted");
            }else{
                System.out.println("This cell is already occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }
    //Time Complexity - O(1)
    //Space Complexity - O(1)

    // TODO : Accessing the value from 2-D Array
    public void accessingValue(int row, int col){
        System.out.println("Accessing Row # " + row + " , Col# " + col);
        try {
            System.out.println("Cell value is: " +arr[row][col]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }
    //Time Complexity - O(1)
    //Space Complexity - O(1)

    // TODO : Traversing the values from 2-D Array
    public void traverse2DArray(){
        for (int row = 0; row < arr.length ; row++){
            for (int col = 0; col < arr[0].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
    //Time Complexity - O(mn)
    //Space Complexity - O(1)

    // TODO : Searching a value from 2-D Array
    public void searchValueIn2DArray(int value){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[0].length;col++){
                if (arr[row][col] == value) {
                    System.out.println("Value is found at index { "+ row + "," + col +" }");
                    return;
                }
            }
        }
        System.out.println("Value is not found");
    }
    //Time Complexity - O(mn)
    //Space Complexity - O(1)

    // TODO : Deleting a value from 2-D Array
    public void deleteValue(int row, int col){
        try {
            System.out.println("successfully deleted : " +arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This index invalid for array");
        }
    }
    //Time Complexity - O(1)
    //Space Complexity - O(1)
}
