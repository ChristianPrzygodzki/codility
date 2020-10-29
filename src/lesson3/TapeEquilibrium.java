package lesson3;

// Tape equilibrium task
// Description:
// https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
// score: 100%

public class TapeEquilibrium {
    public int solution(int[] A) {
        int p = 1;
        int sum = 0;
        int left = A[0];
        for(int a:A){
            sum += a;
        }
        int lowestDifference = Math.abs(sum - 2 * left);
        for (int i = 1; i < A.length-1; i++) {
            left+=A[i];
            if(Math.abs(sum - 2*left)<lowestDifference){
                lowestDifference = Math.abs(sum - 2*left);
            }
        }
        return lowestDifference;
    }
}
