import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReverseListTest {

    @Test
    public void testReverseList(){
        List<Integer> list = Arrays.asList(4,5,7,8,9,7);
        assertEquals(ReverseList.reverse(list), Arrays.asList(7,9,8,7,5,4));
    }
}
