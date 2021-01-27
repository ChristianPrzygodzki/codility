package lesson7;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class StoneWallTest {

    StoneWall testedClass = new StoneWall();

    @Test
    public void shouldReturn0ForATrivialWallArgument(){
        // given
        int[] wall = {};
        int expectedNumberOfRectangles = 0;

        // when
        int result = testedClass.solution(wall);

        // then
        Assertions.assertEquals(expectedNumberOfRectangles, result);
    }

    @Test
    public void shouldReturn3ForASimpleWallArgument(){
        // given
        int[] wall = {1,2,3};
        int expectedNumberOfRectangles = 3;

        // when
        int result = testedClass.solution(wall);

        // then
        Assertions.assertEquals(expectedNumberOfRectangles, result);
    }

    @Test
    public void shouldReturn7ForCodilityTestCaseWall(){
        // given
        int[] wall = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        int expectedNumberOfRectangles = 7;

        // when
        int result = testedClass.solution(wall);

        // then
        Assertions.assertEquals(expectedNumberOfRectangles, result);
    }

}
