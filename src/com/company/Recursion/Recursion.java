package com.company.Recursion;

public class Recursion {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        System.out.println("Факториал равен " + factorial.fact(1));
        System.out.println("Факториал равен " + factorial.fact(3));
        System.out.println("Факториал равен " + factorial.fact(4));
    }
}
