package lesson6;

// Distinct task
// Description:
// https://app.codility.com/programmers/lessons/6-sorting/distinct/
// score: 91%, Correctness: 100%

import java.util.Arrays;

public class Distinct {
    public int solution(int[] A) {
        return (int)Arrays.stream(A).distinct().count();
    }
}
