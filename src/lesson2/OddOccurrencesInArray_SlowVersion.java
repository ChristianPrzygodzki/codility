package lesson2;

// Odd occurrences in array task
// Description:
// https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
// Total score: 44% due to slow performance

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class OddOccurrencesInArray_SlowVersion {
    public int solution(int[] A) {
        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
        for(Integer i:list){
            if(Collections.frequency(list, i)==1){
                return i;
            }
        }
        throw new IllegalArgumentException("Wrong array passed to the function.");
    }
}