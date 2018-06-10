package com.company.Test5;

public class Codility2 {
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
        public static int solution(String S) {
            // write your code in Java SE 8
            Integer l = 0;
            Integer r = 0;
            Integer p = 0;

            for (int i = 0; i < S.length(); i++){
                if (S.charAt(i) == 'L') {
                    l++;
                }

                if (S.charAt(i) == 'R'){
                    r++;
                }

                if(l==r){
                    p++;
                    l = 0;
                    r = 0;
                }
            }
            return p;
        }

        public static void main(String[] args){
            System.out.println(solution("RLRRLLRLRRLL"));
            System.out.println(solution("RLLLRRRLLR"));
            System.out.println(solution("LLRLRLRLRLRLRR"));
        }
    }

