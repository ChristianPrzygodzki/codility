package lesson4;

// Missing integer task
// Description:
// https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
// score: 66%

public class MissingInteger_SlowVersion {
    public int solution(int[] A) {
        int i = 1;
        while(true){
            boolean found = false;
            for(int a:A){
                if(i == a){
                    found = true;
                    break;
                }
            }
            if(!found){
                return i;
            }
            i++;
        }
    }
}
