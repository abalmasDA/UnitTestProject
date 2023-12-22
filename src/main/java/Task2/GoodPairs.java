package Task2;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GoodPairs {
    public static int foundNumberGoodPairs(int[] numbers) {
        return Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .mapToInt(count -> (int) ((count * (count - 1)) / 2))
                .sum();
    }

}
