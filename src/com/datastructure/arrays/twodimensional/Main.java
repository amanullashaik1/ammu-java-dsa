package com.datastructure.arrays.twodimensional;

import  java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //TODO : Declaration

        System.out.println("----------------Declaring the value in a two dimensional array---------------------");

        //Step 1 : Declare
        int[][] int2DArray;

        //Step 2 : Instantiate
        int2DArray = new int[2][2];

        //Step 3 : Initialise
        int2DArray[0][0] = 10;  //|
        int2DArray[0][1] = 20;  //|----------------> O(mn)
        int2DArray[1][0] = 30;  //|
        int2DArray[1][1] = 40;  //|

        System.out.println(Arrays.deepToString(int2DArray));

        //All Together

        String s2DArray[][] = {{"a", "b"}, {"b","c"}}; //----------> O(1)

        System.out.println(Arrays.deepToString(s2DArray));

        //Time Complexity : above
        //Space Complexity : O(mn)

        //TODO : Insertion
        System.out.println("----------------Inserting the value in a two dimensional array---------------------");

        TwoDArrayOps twoDArrayOps = new TwoDArrayOps(3,3);
        twoDArrayOps.insertValue(0,0,1);
        twoDArrayOps.insertValue(0,1,7);
        twoDArrayOps.insertValue(1,0,70);
        twoDArrayOps.insertValue(1,1,17);
        twoDArrayOps.insertValue(2,0,0);
        twoDArrayOps.insertValue(2,1,77);

//        System.out.println(Arrays.deepToString(twoDArrayOps.arr)+"printing above inserted value"); //commnet out to check accessing method below

        //TODO : Accessing the value
        System.out.println("----------------Accessing the value in a two dimensional array---------------------");

        twoDArrayOps.accessingValue(0,1);

        //TODO : Traversal the value
        System.out.println("----------------Traversing the value in a two dimensional array---------------------");

        twoDArrayOps.traverse2DArray();

        //TODO : Seaching a value
        System.out.println("----------------Searching a value in a two dimensional array---------------------");

        twoDArrayOps.searchValueIn2DArray(7);
        twoDArrayOps.searchValueIn2DArray(7000);

        //TODO : Deleting a value
        System.out.println("----------------Deleting a value in a two dimensional array---------------------");

        System.out.println(Arrays.deepToString(twoDArrayOps.arr));      //before deleting
        twoDArrayOps.deleteValue(0,0);
        System.out.println(Arrays.deepToString(twoDArrayOps.arr));      //after deleting, to check whether element is deleted or not, if deleted value will be shown as -2147483...(MIN_VALUE)
    }

}
