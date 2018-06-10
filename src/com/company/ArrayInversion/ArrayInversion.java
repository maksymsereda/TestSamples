package com.company.ArrayInversion;

import java.util.Arrays;

public class ArrayInversion {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        for (int index = 0; index < data.length / 2; index++) {
            swap(data, index, data.length -1 - index);
            /*0, data.length -1 - 0;
            1, data.length -1 - 1;
            2, data.length -1 - 2;*/
        }
        System.out.println(Arrays.toString(data));
    }

    private static void swap(int[] array, int first, int second) {
        int tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }
}