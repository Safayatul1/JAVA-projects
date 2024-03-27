import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProductUpTo3Test {
    @Test
    public void testLength0() {
        assertEquals(ProductUpTo3.productUpToFirst3(new int[]{}), 1);
    }

    // TODO - write your code below this comment.
    // You will need to write at least FOUR tests for the
    // method you wrote in ProductUpTo3.java.  Each test should
    // test a different behavior of this method.
    //
    // If you're not sure you're testing all the
    // behaviors, don't hesitate to ask!
    @Test
    public void testLength1() {
        assertEquals(ProductUpTo3.productUpToFirst3(new int[]{3}), 3);
    }

    @Test
    public void testLength2() {
        assertEquals(ProductUpTo3.productUpToFirst3(new int[]{3, 11}), 33);
    }

    @Test
    public void testLength3() {
        assertEquals(ProductUpTo3.productUpToFirst3(new int[]{3, 11, 3}), 99);
    }

    @Test
    public void testLength4() {
        assertEquals(ProductUpTo3.productUpToFirst3(new int[]{3, 11, 3, 1000}), 99);
    }

}
