package lesson3;

// Perm missing elem task
// Description:
// https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
// score: 100%

public class PermMissingElem {
    public int solution(int[] A) {
        int[] tab = new int[A.length+1];
        for(int a:A){
            tab[a-1] = a;
        }
        for (int i = 0; i < tab.length; i++) {
            if(tab[i]==0){
                return i+1;
            }
        }
        throw new IllegalArgumentException("Incorrect array passed to function.");
    }
}
