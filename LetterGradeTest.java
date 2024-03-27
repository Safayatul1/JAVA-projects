import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LetterGradeTest {
    // TODO - write your code below this comment.
    // Write 12 tests, where each test corresponds
    // to one of the possible class grades.  As a hint,
    // most of these tests look a lot like each other, so
    // you might be able to work faster by copy-pasting
    // the same test and then editing it for the given case.
    @Test
    public void checkGrade1() {
      assertEquals("A", LetterGrade.letterGrade(96.3));
    }

    @Test
    public void checkGrade2() {
      assertEquals("A-", LetterGrade.letterGrade(90.9));
    }

    @Test
    public void checkGrade3() {
      assertEquals("B+", LetterGrade.letterGrade(89.1));
    }

    @Test
    public void checkGrade4() {
      assertEquals("B", LetterGrade.letterGrade(85.6));
    }

    @Test
    public void checkGrade5() {
      assertEquals("B-", LetterGrade.letterGrade(82.2));
    }

    @Test
    public void checkGrade6() {
      assertEquals("C+", LetterGrade.letterGrade(77.4));
    }

    @Test
    public void checkGrade7() {
      assertEquals("C", LetterGrade.letterGrade(76.0));
    }

    @Test
    public void checkGrade8() {
      assertEquals("C-", LetterGrade.letterGrade(72.3));
    }

    @Test
    public void checkGrade9() {
      assertEquals("D+", LetterGrade.letterGrade(67.6));
    }

    @Test
    public void checkGrade10() {
      assertEquals("D", LetterGrade.letterGrade(63.5));
    }

    @Test
    public void checkGrade11() {
      assertEquals("D-", LetterGrade.letterGrade(60.9));
    }

    @Test
    public void checkGrade12() {
      assertEquals("F", LetterGrade.letterGrade(26.0));
    }
}
