package com.company.SumAverrageMediana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Average {
    public static void main(String[] args) {
        double sum = 0;
        List<Double> array = new ArrayList<>(Arrays.asList(3.0, 2.0, 3.0, 10.0, 6.0, 8.0));


        for (Double eachIndex : array) {
            sum += eachIndex;
        }
        System.out.println("Sum of numbers: " + sum);


        double average = sum/2;
        System.out.println("Average number: " + average);


        Collections.sort(array);
        System.out.println("Sorted array: " + array);
        double median;
        if (array.size() % 2 == 0)
            median = (array.get(array.size() / 2) + array.get(array.size() / 2 - 1))/2;     //(3+6) / 2 = 4.5
        else
            median = array.get(array.size() / 2);
        System.out.println("Median number: " + median);
    }
}
