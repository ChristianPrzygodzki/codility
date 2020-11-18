package lesson5;

// Count div task
// Description:
// https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/
// score: 100%, Correctness: 100%

public class CountDiv {
    public int solution(int A, int B, int K) {
        int additional = 0;
        // 1.
        // We check if there is additional number, which we needed to erase in
        // our way of counting (see 2.)
        // If so, we need to add it to the final result.
        if(A%K != 1 && K != 1 && ( (B - A + 1 > K - A%K) || (A%K == 0) ) ){
            additional = 1;
        }
        // 2.
        // It is (B - A + 1) - ( (K - 1) - Math.floorMod(A - 2, K) ) simplified
        // We take all numbers from between A and B and erase all those before
        // first such x, that x%K = 1. Now we can make integer division to get the answer.
        // At the end we conditionally add 1 if there is number divided by K in erased numbers.
        return ((B - A + 2 - K + Math.floorMod(A - 2, K)) / K + additional);
    }
}
