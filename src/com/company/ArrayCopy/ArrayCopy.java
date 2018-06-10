package com.company.ArrayCopy;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        System.arraycopy(data,0,data,2,2);
        System.out.println(Arrays.toString(data));
    }
}
