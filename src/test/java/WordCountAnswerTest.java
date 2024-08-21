import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCountAnswerTest {

    @Test
    public void testCount(){
        String str1 = "Hello how are you?";
        String str2 = "Hello we are here for learning java collections.";
        assertEquals(WordCountAnswer.getOccurrences(str1, "hello"), 1);
        assertEquals(WordCountAnswer.getOccurrences(str2, "python"), 0);
    }
}
