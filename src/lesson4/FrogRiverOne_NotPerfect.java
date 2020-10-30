package lesson4;

// Frog river one task
// Description:
// https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
// score: 72%

public class FrogRiverOne_NotPerfect {
    public int solution(int X, int[] A) {
        boolean[] conditions = new boolean[X];
        FIRST:
        for (int i = 0; i < A.length; i++){
            conditions[A[i]-1] = true;
            for(boolean cond:conditions){
                if(!cond){
                    continue FIRST;
                }
            }
            return i;
        }
        return -1;
    }
}
