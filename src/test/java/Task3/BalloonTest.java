package Task3;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class BalloonTest {
    @Test
    public void foundMaxNumberOfInstancesTest() {
        String text = "balloon";
        int expectedResult = 1;
        int result = Balloon.foundMaxNumberOfInstances(text);
        assertThat(result).isEqualTo(expectedResult);
    }
}