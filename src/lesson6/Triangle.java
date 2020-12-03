package lesson6;

// Triangle task
// Description:
// https://app.codility.com/programmers/lessons/6-sorting/triangle/
// Score: 68%, Correctness: 90%, Performance: 33%
// Easiest solution.
// It does not handle sums, that overflows integer, so correctness is below 100%.

public class Triangle {
    public int solution(int[] A) {
        int length = A.length;
        if (length < 3) {
            return 0;
        }
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (A[i] + A[j] > A[k] && A[i] + A[k] > A[j] && A[j] + A[k] > A[i]) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}

