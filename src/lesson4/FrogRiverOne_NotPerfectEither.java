package lesson4;

// Frog river one task
// Description:
// https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
// score: 54%

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FrogRiverOne_NotPerfectEither {
    public int solution(int X, int[] A) {
        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
        int[] indices = new int[X];
        for (int i = 1; i <= X; i++) {
            indices[i - 1] = list.indexOf(i);
        }
        for(int i:indices){
            if(i == -1){
                return -1;
            };
        }
        Arrays.sort(indices);
        return indices[X-1];
    }
}
