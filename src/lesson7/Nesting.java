package lesson7;

// Nesting task
// Description:
// https://app.codility.com/programmers/lessons/7-stacks_and_queues/nesting/
// score: 50%, Correctness: 100%

public class Nesting {
    public int solution(String S) {
        int length = S.length();
        // odd length means string is not properly nested
        if(length%2==1){
            return 0;
        }
        // check 1st and 2nd condition
        if(S.isEmpty() ||
                (S.startsWith("(") && S.endsWith(")") && solution(S.substring(1,length-1))==1)){
            return 1;
        }
        // check 3rd condition, where V (from task description)
        // can end on any even index excluding 0 and last one
        for (int i = 2; i <= length-2; i+=2) {
            if(solution(S.substring(0,i)) == 1 && solution(S.substring(i,length)) == 1){
                return 1;
            }
        }
        // if no condition is fulfilled
        return 0;
    }
}
