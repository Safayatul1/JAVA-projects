import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class StringExplodeTest {
    // TODO - write tests for the method you wrote in StringExplode.java.
    // You should test with strings of length 0, 1, 2, and 3.
    
   @Test
   public void test0(){
      char[] StringToArray = StringExplode.explode("");
      assertArrayEquals(new char[0], StringToArray);
      }
   @Test
   public void test1(){
      char[] StringToArray = StringExplode.explode("a");
      assertArrayEquals(new char[]{'a'}, StringToArray);
      }

  @Test
   public void test2(){
      char[] StringToArray = StringExplode.explode("bb");
      assertArrayEquals(new char[]{'b' , 'b'}, StringToArray);
      }

   @Test
   public void test3(){
      char[] StringToArray = StringExplode.explode("ccc");
      assertArrayEquals(new char[]{'c','c','c'}, StringToArray);
      }
    
     }
