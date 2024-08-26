import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FiveOrFewerCharsTest {

    @Test
    public void testWordCount(){
        assertEquals(FiveOrFewerChars.getFiveOrFewerCharWords("there are both smaller and bigger words here"), Arrays.asList("there", "are", "both", "and", "words", "here"));
        assertEquals(FiveOrFewerChars.getFiveOrFewerCharWords("new string with new words"), Arrays.asList("new", "with", "new", "words"));
    }
}
