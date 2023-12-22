package Task2;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class GoodPairsTest {
    @Test
    public void foundNumberGoodPairsTest() {
        int[] nums = {1, 2, 2, 1};
        int expectedResult = 2;
        int result = GoodPairs.foundNumberGoodPairs(nums);
        assertThat(result).isEqualTo(expectedResult);
    }
}