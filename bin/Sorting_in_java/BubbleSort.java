package Sorting_in_java;
import java.util.Arrays;;

public class BubbleSort {
    public static void main(String[]args){
        int arr[] = {8,9,7,5,6,4,3,2};
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
