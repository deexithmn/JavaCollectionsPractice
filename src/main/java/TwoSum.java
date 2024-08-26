import java.util.*;

public class TwoSum {

    public static List<Integer> getSum(List<Integer> list, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        final List<Integer> result = new ArrayList<>();
        final int[] index = {0};
        list.forEach((v) -> {
            if (map.containsKey(sum - v)) {
                result.add(map.get(sum - v));
                result.add(index[0]);
            } else {
                map.put(v, index[0]);
                index[0] = index[0] +1;
            }
        });
        return result;
    }
}
