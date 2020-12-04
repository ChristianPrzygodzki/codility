package lesson6;

// Number of disc intersections task
// Description:
// https://app.codility.com/programmers/lessons/6-sorting/number_of_disc_intersections/
// Score: 62%, Correctness: 100%

public class NumberOfDiscIntersections {
    public int solution(int[] A) {
        int length = A.length;
        int count = 0;
        for (int i = 0; i < length-1; i++) {
            // disc of length A[i] surely intersect with at least A[i] next discs if they exists
            int rangeRight = Math.min(A[i], length - i - 1);
            count += rangeRight;
            int iRange = i + rangeRight;
            for (int j = iRange + 1; j < length; j++) {
                if(A[j] >= j - iRange){ // A[j] + iRange >= j is more legible, but it can oveflow int
                    count++;
                }
            }
            if(count > 10_000_000){
                return -1;
            }
        }
        return count;
    }
}
