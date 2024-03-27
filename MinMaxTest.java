import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MinMaxTest {
    // There are SIX tests in total which you must write.
    // The comments below discuss these, three at a time.
    
    // There are three behaviors of interest for MinMax.min:
    //
    // 1. If the first parameter is smaller than the second, the
    //    first parameter is returned.
    // 2. If the first parameter is equal to the second, either
    //    parameter is returned
    // 3. If the first parameter is greater than the second, the
    //    second parameter is returned.
    //
    // For each of the above behaviors, write a test that makes sure
    // that MinMax.min actually shows the behavior of interest.
    // TODO - write your code below this comment.
    @Test
    public void testMin1(){
      int expected = 25;
      int actual = MinMax.min(25,35);
      assertEquals(expected,actual);
    }
    
    @Test
    public void testMin2(){
      int expected = 35;
      int actual = MinMax.min(35,35);
      assertEquals(expected,actual);
    }
    
    @Test
    public void testMin3(){
      int expected = 25;
      int actual = MinMax.min(35,25);
      assertEquals(expected,actual);
    }





    // There are three behaviors of interest for MinMax.max:
    //
    // 1. If the first parameter is greater than the second, the
    //    first parameter is returned.
    // 2. If the first parameter is equal to the second, either
    //    parameter is returned
    // 3. If the first parameter is less than the second, the
    //    second parameter is returned.
    //
    // For each of the above behaviors, write a test that makes sure
    // that MinMax.max actually shows the behavior of interest.
    // TODO - write your code below this comment.
    
    @Test
    public void testMax1(){
      int expected = 35;
      int actual = MinMax.max(35,25);
      assertEquals(expected,actual);
    }
    
    @Test
    public void testMax2(){
      int expected = 35;
      int actual = MinMax.max(35,35);
      assertEquals(expected,actual);
    }
    
    @Test
    public void testMax3(){
      int expected = 35;
      int actual = MinMax.max(25,35);
      assertEquals(expected,actual);
    }



}
