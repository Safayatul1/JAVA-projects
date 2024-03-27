import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CompareNumsTest {
    // TODO - write your code below this comment.
    // Write three tests, where each test corresponds to one
    // of the three possible scenarios:
    // - CompareNums.comparison returns "less than"
    // - CompareNums.comparison returns "equal to"
    // - CompareNums.comparison returns "greater than"
    @Test
    public void test1() {
    assertEquals("less than", CompareNums.comparison(2,6));
    }

    @Test
    public void test2() {
    assertEquals("equal to", CompareNums.comparison(4,4));
    }

    @Test
    public void test3() {
    assertEquals("greater than", CompareNums.comparison(11,6));
    }
}
