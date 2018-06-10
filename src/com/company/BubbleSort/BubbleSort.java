package com.company.BubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] data = {40,10,50,30,20};
        for (int barrier = data.length -1; barrier >=1 ; barrier--){
            for (int index = 0; index < barrier; index++){
                if (data[index] > data[index + 1]){
                    swap(data,index);
                }
                System.out.print(index);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(Arrays.toString(data));
    }

    private static void swap(int[] array, int k) {
        int tmp = array[k];
        array[k] = array[k+1];
        array[k+1] = tmp;
    }
}