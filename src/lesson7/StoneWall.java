package lesson7;

// Stone Wall task
// Description:
// https://app.codility.com/programmers/lessons/7-stacks_and_queues/stone_wall/
// Score: , Correctness:

import java.util.ArrayList;
import java.util.List;

public class StoneWall {
    public int solution(int[] H) {
        // I want to try an idea to divide all wall to rectangles
        // as long as possible horizontally, then give them extra
        // height if possible. However I do not know yet if it is
        // always optimal (lowest nr).
//         int counter = 0; // wont need it I guess

        return giveMinimalNumberOfRectangles(H);
    }
    private int giveMinimalNumberOfRectangles(int[] wall){

        int minimalHeight = getMinimalHeight(wall);

        for (int i = 0; i < wall.length; i++) {
            wall[i]-=minimalHeight;
        }
        List<int[]> smallWalls = new ArrayList<int[]>();

        // smallWalls construction
        for(int i = 0; i < wall.length; i++){
            int smallWallLength = 0;
            while(i < wall.length && wall[i]==0 ){
                i++;
            }
            while(i < wall.length && wall[i]!=0){
                smallWallLength++;
                i++;
            }
            int[] smallWall = new int[smallWallLength];
            for (int j = 0; j < smallWallLength; j++) {
                smallWall[j] = wall[i-smallWallLength+j];
            }
            smallWalls.add(smallWall);
        }

        int result = 1; // long rectangle at the bottom
        for(int[] smallWall:smallWalls){
            result+=giveMinimalNumberOfRectangles(smallWall);
        }
        return result;
    }

    private int getMinimalHeight(int[] wall){
        int min = Integer.MAX_VALUE;
        for(int partHeight:wall){
            if(partHeight<min){
                min = partHeight;
            }
        }
        return min;
    }
}
