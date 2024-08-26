import java.util.List;

public class CalculateAverage {
    public static double getAverage(List<Integer> list) {
        return list.stream().mapToDouble(value -> value).average().getAsDouble();

    }
}
