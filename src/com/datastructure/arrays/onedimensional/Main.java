package com.datastructure.arrays.onedimensional;

import com.datastructure.arrays.onedimensional.ArrayOps;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // for insertion.

        System.out.println("--------Inserting an element in an array-----------------");

        ArrayOps insertion = new ArrayOps(10);
        insertion.insert(0,10);
        insertion.insert(1,1);
        insertion.insert(2,2);
        insertion.insert(3,4);
        insertion.insert(2, 5);
        insertion.insert(20,30);

        System.out.println("--------Accessing an element in an array-----------------");

        var firstElement = insertion.arr[0];
        System.out.println(firstElement);
        var secondElement = insertion.arr[1];
        System.out.println(secondElement);
        var thirdElement = insertion.arr[4]; //should throw exception
        System.out.println(thirdElement);

        System.out.println("--------Traversing an element in an array-----------------");

        System.out.println("Array Traversal");
        insertion.traverseArray();

        System.out.println("                                                               ");

        System.out.println("--------Searching an element in an array-----------------");

        insertion.searchInArray(10);
        insertion.searchInArray(200);

        System.out.println("--------Deleting an element in an array-----------------");

        insertion.deleteValue(0);
        System.out.println(insertion.arr[0]);

        System.out.println("--------self-----------------");

        ArrayOps insertion1 = new ArrayOps(2);
        insertion1.inserVlaue(0,2);
        insertion1.inserVlaue(1,3);

//        System.out.println(Arrays.toString(2));
    }
}
