package com.datastructure.arrays.onedimensional;

import java.util.Arrays;
//TODO: When we create an array, we
// Declare - create a reference to array,
// Instantiation of an array - create an array,
// Initialization - assigns values to cells in array.
// dataType[] arr
public class Creation {

    public static void main(String[] args) {
        int[] intArray;
        intArray = new int[3]; // [0,0,0]
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        System.out.println(Arrays.toString(intArray));

        String[] names = {"a","b", "c"};
        System.out.println(Arrays.toString(names));
    }
    //TODO : Creation an empty array
    //Time Complexity - O(1)
    //Space complexity - O(n)
}
