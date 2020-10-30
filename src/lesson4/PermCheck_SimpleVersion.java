package lesson4;

// Perm check task
// Description:
// https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
// score: 66%, Correctness: 100%

public class PermCheck_SimpleVersion {
    public int solution(int[] A) {
        for (int i = 1; i <= A.length; i++) {
            int presenceCount = 0;
            for(int a:A){
                if(a==i){
                    presenceCount++;
                }
            }
            if(presenceCount!=1){
                return 0;
            }
        }
        return 1;
    }
}
