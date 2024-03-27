import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntCompareTest {
    @Test
    public void testLessThanIsLessThan() {
        assertEquals(true, IntCompare.firstIsLessThanSecond(0, 1));
    }

    @Test
    public void testLessThanNotLessThan() {
        assertEquals(false, IntCompare.firstIsLessThanSecond(1, 0));
    }

    // You will need to write TWO tests:
    // 1.) A test to make sure that firstIsGreaterThanSecond returns
    //     true if the first parameter is greater than the second
    // 2.) A test to make sure that firstIsGreaterThanSecond returns
    //     false if the first parameter is not greater than the second
    // TODO - write your code below this comment.
    @Test
    public void testGreaterThanIsGreaterThan() {
        assertEquals(true, IntCompare.firstIsGreaterThanSecond(10, 1));
    }

    @Test
    public void testGreaterThanNotGreaterThan() {
        assertEquals(false, IntCompare.firstIsGreaterThanSecond(1, 10));
    }
}
