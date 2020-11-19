package lesson5;

// Genomic range query task
// Description:
// https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/
// Score: 62%, Correctness: 100%
// Performance: 0 % :(

public class GenomicRangeQuery_SlowVersion {
    public int[] solution(String S, int[] P, int[] Q) {
        int M = P.length;
        int[] result = new int[M];
        for (int i = 0; i < M; i++) {
            String part = S.substring(P[i], Q[i]+1);
            if(part.contains("A")){
                result[i] = 1;
            }
            else if(part.contains("C")){
                result[i] = 2;
            }
            else if(part.contains("G")){
                result[i] = 3;
            }
            else {
                result[i] = 4;
            }
        }
        return result;
    }
}
