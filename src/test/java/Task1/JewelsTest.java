package Task1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class JewelsTest {
    @Test
    public void numberJewelsInStonesTest() {
        String jewels = "G";
        String stones = "GGGGgaAAbbbb";
        long expectedResult = 4;
        long result = Jewels.foundNumberOfJewelsInStones(jewels, stones);
        assertThat(result).isEqualTo(expectedResult);
    }
}
