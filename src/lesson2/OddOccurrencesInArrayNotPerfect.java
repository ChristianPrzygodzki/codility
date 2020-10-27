package lesson2;

// Odd occurrences in array task
// Description:
// https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
// Total score: 55% (still too slow)

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArrayNotPerfect {
    public int solution(int[] A) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : A) {
            map.merge(i, 1, Integer::sum);
        }
        for(Integer k: map.keySet()){
            if(map.get(k)==1){
                return k;
            }
        }
        throw new IllegalArgumentException("Wrong array passed to the function.");
    }
}
