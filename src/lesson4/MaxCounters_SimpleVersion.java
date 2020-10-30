package lesson4;

// Max counters task
// Simplest version, step by step, no optimization
// Description:
// https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
// score: 66%

import java.util.Arrays;

public class MaxCounters_SimpleVersion {
    public static int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        for(int a:A){
            if(a == N+1){
                Arrays.sort(counters);
                for(int i=0;i<N;i++){
                    counters[i] = counters[N-1];
                }
            }else{
                counters[a-1]++;
            }
        }
        return counters;
    }
}
