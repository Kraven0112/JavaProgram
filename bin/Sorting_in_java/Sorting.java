package Sorting_in_java;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {12,1,2,3,16,2,6,78,23,45,21};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
// Bubble sort
// Selection sort
// Insertion sort
//time complexity is a no. of operations or running time.
//best-case Omega(n)
//average-case Theta (n+1/2)
//worst-case Big O(n)