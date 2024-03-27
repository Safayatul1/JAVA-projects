import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        // TODO - write your code below this comment
        Scanner in = new Scanner(System.in);
        System.out.println("Enter principle (long): ");
        long P = in.nextLong();
        System.out.println("Enter annual interest rate (double): ");
        double R = in.nextDouble();
        System.out.println("Enter number of times interest is compounded per year (int): ");
        int N = in.nextInt();
        System.out.println("Enter number of year invested (int): ");
        int T = in.nextInt();
        System.out.println("Compound interest including principal: ");
        System.out.println(P * Math.pow(1 + R / N, N * T));
    
            }
}
