package lesson5;

// Passing cars task
// Description:
// https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/
// score: 50%, Correctness: 100%

public class PassingCars_Simple {
    public int solution(int[] A) {
        int nrOfPairs = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if(A[i]==0){
                for(int j = i+1; j < A.length; j++){
                    if(A[j]==1){
                        nrOfPairs++;
                    }
                }
            }
        }
        if(nrOfPairs>1_000_000_000){
            return -1;
        }
        return nrOfPairs;
    }

}
