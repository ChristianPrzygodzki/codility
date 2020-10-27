package lesson3;

// Frog jmp task
// Description:
// https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
// score: 100%

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        return (int)Math.ceil((Y-X)/(double)D);
    }
}
