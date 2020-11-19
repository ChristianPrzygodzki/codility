package lesson5;

// Min avg two slice task
// Description:
// https://app.codility.com/programmers/lessons/5-prefix_sums/min_avg_two_slice/
// score: 100%, correctness: 100%, time complexity: O(N)

public class MinAvgTwoSlice {
    public int solution(int[] A) {
        int position = 0;
        double avg = 10_001.0;
        for (int i = 0; i < A.length - 1; i++) {
            if((A[i] + A[i+1])/2.0 < avg){
                position = i;
                avg = (A[i] + A[i+1])/2.0;
            }
        }
        for (int i = 0; i < A.length - 2; i++) {
            if((A[i] + A[i+1] + A[i+2])/3.0 < avg){
                position = i;
                avg = (A[i] + A[i+1] + A[i+2])/3.0;
            }
        }
        // no need to consider bigger slices
        return position;
    }
}
