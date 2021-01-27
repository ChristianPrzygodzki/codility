package lesson7;

// Stone Wall task
// Description:
// https://app.codility.com/programmers/lessons/7-stacks_and_queues/stone_wall/
// Score: 85%, Correctness: 100%

import java.util.ArrayList;
import java.util.List;

public class StoneWall {
    // I want to try an idea to divide all wall to rectangles
    // as long as possible horizontally, then give them extra
    // height if possible.
    // It turned out it is correct way to get minimal number.
    public int solution(int[] H) {
        return giveMinimalNumberOfRectangles(H);
    }

    private int giveMinimalNumberOfRectangles(int[] wall){
        if(wall.length==0){
            return 0;
        }
        int minimalHeight = getMinimalHeight(wall);

        // We cut the bottom of the wall and count that
        // bottom as 1 rectangle (result).
        for (int i = 0; i < wall.length; i++) {
            wall[i]-=minimalHeight;
        }
        int result = 1;

        // After we took the bottom, there are
        // smaller walls that left.
        List<int[]> smallWalls = new ArrayList<>();

        // Small walls construction.
        for(int i = 0; i < wall.length; i++){
            int smallWallLength = 0;

            // We ignore zeros at the beginning.
            while(i < wall.length && wall[i]==0 ){
                i++;
            }
            // Small wall ends when we meet another zero.
            while(i < wall.length && wall[i]!=0){
                smallWallLength++;
                i++;
            }
            int[] smallWall = new int[smallWallLength];
            // Small wall gets its heights.
            if (smallWallLength >= 0) System.arraycopy(wall, i - smallWallLength, smallWall, 0, smallWallLength);
            smallWalls.add(smallWall);
        }

        // Number of rectangles is equal to 1 plus nr of rectangles
        // needed for all small walls.
        for(int[] smallWall:smallWalls){
            result+=giveMinimalNumberOfRectangles(smallWall);
        }
        return result;
    }

    private int getMinimalHeight(int[] wall){
        if(wall.length==0){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for(int partHeight:wall){
            if(partHeight<min){
                min = partHeight;
            }
        }
        return min;
    }
}
