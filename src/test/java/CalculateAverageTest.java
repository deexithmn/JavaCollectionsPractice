import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CalculateAverageTest {

    @Test
    public void getAverageTest(){
        assertEquals(CalculateAverage.getAverage(Arrays.asList(2,5,20,30,56)), 22.6, 0.0);
    }
}
