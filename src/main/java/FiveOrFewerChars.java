import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiveOrFewerChars {

    public static List<String> getFiveOrFewerCharWords(String str){
        return Arrays.asList(str.split(" ")).stream().filter(s -> s.length()<=5).collect(Collectors.toList());
    }
}
