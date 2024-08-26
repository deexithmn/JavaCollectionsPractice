import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {

    @Test
    public void testSum(){
        List<Integer> input = Arrays.asList(5, 6, 8, 7);
        int sum = 11;
        assertEquals(TwoSum.getSum(input, sum), Arrays.asList(0,1));

    }
}
