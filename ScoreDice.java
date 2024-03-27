import java.util.Scanner;
import java.util.Random;

public class ScoreDice {
    private Random r;

    public ScoreDice(long seed) {
        r = new Random(seed);
    }

    public int rollD6() {
        return r.nextInt(6) + 1;
    }

    public int score() {
        int roll1 = rollD6();
        int roll2 = rollD6();
        return scoreWithNumbers(roll1, roll2);
    }
    
    // You will need to write a static method named scoreWithNumbers.
    // scoreWithNumbers returns a score based on the values
    // of its inputs, as such:
    //
    // - If both inputs are 1 or if both inputs are 6, then
    //   the returned score is 10
    // - If both inputs are the same (but not 1 or 6), then
    //   the returned score is 8
    // - If the inputs are different, the score is whatever the
    //   smaller value is (e.g., if given 3 and 4, it returns 3).
    //
    // TODO - write your code below this comment.
    public static int scoreWithNumbers(int num1, int num2){
    if ((num1 == 1 && num2 ==1) || (num1 == 6 && num2 == 6)){
    return 10;
    } else if (num1 == num2) {
    return 8;
    } else {
    return Math.min(num1, num2);
    }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter seed: ");
        long seed = input.nextLong();
        ScoreDice scoreDice = new ScoreDice(seed);
        System.out.println("Score: " + scoreDice.score());
    }
}
