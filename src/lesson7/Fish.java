package lesson7;

// Fish task
// Description:
// https://app.codility.com/programmers/lessons/7-stacks_and_queues/fish/
// score: 62%, Correctness: 100%

public class Fish {
    public int solution(int[] A, int[] B) {
        int eaten = 0;
        int len = B.length;
        for(int i = 0; i < len; i++){
            // for 0s (swimming left - upstream)
            if(B[i] == 0){
                int size = A[i];
                for(int j = i - 1; j >= 0; j--){
                    if(B[j] == 0){
                        size = Math.max(size, A[j]);
                    }
                    else if(A[j] > size ){
                        eaten++;
                        break;
                    }
                }
            }
            // for 1s (swimming right - downstream)
            else{
                // our guy stre
                int size = A[i];
                for(int j = i+1; j < len; j++){
                    if(B[j] == 1){
                        size = Math.max(size, A[j]);
                    }
                    else if(A[j] > size ){
                        eaten++;
                        break;
                    }
                }
            }
        }
        return len-eaten;
    }
}
