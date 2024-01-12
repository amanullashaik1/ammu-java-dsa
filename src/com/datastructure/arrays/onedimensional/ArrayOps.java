package com.datastructure.arrays.onedimensional;

import javax.swing.*;
import java.time.temporal.ValueRange;

public class ArrayOps {

    int[] arr = null;

    //constructor
    public ArrayOps(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i = 0; i<arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    //TODO : Inserting a value in an array

    public void insert(int location, int valueToBeInserted){
        try{
            if (arr[location]==Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted");
            }else {
                System.out.println("This cell is already occupied");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array!!");
        }
    }

    public void inserVlaue(int location, int valueToBeInserted){
        try{
            if (arr[location]==Integer.MIN_VALUE){
                arr[location]= valueToBeInserted;
                System.out.println("Successfully inserted");
            }else{
                System.out.println("Allocated already");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
    }
    //Time Complexity - O(1)
    //Space Complexity - O(1)

    //TODO : Array Traversal

    public void traverseArray(){
        try{
            for (int i = 0; i< arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }catch (Exception e){
            System.out.println("Array no longer exists!!");
        }
    }
    //Time complexity - O(n)
    //Space Complexity - O(1)

    //TODO : Searching an element from an array

    public void searchInArray(int valueToSearch){
        for (int i = 0; i<arr.length;i++){
            if(arr[i]==valueToSearch){
                System.out.println("Value is found at the index of " +i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");
    }
    //Time complexity - O(n)
    //Space complexity - O(1)

    //TODO : Delete value in an array

    public void deleteValue(int valueToDeleteIndex){
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The vlaue is not found");
        }
    }
    //Time complexity - O(1)
    //Space complexity - O(1)
}
