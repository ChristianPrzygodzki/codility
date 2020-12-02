package lesson6;

// Max product of three task
// Description:
// https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/
// score: 88%, Correctness: 100%, Performance: 80%

import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A) {
        int[] B = Arrays.stream(A).sorted().toArray();
        int length = B.length;
//        Firstly I excluded 2 untypical cases into "if" statements,
//        but it turned out that it is not necessary.

//        // has not a single positive
//        if(B[length-1] < 1){
//            return B[length-1]*B[length-2]*B[length-3];
//        }
//        // has only 1 or 2 positives
//        if(B[length-3] < 1){
//            return B[0]*B[1]*B[length-1];
//        }

        // 3 positive give max product or 3 highest non
        // positive if there is not a single positive
        int onlyHighest = B[length-1]*B[length-2]*B[length-3];
        // One max positive with 2 negatives (or zero)
        int with2Lowest = B[length-1]*B[0]*B[1];
        return (onlyHighest > with2Lowest ? onlyHighest : with2Lowest);
    }
}