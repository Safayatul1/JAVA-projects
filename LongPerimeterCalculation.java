import java.util.Scanner;

public class LongPerimeterCalculation {
    public static void main(String[] args) {
        // TODO - write your code below this comment
        
    Scanner in = new Scanner(System.in);
        System.out.print("Enter width: ");
        long first = in.nextLong();
        System.out.print("Enter height: ");
        long second = in.nextLong();
        long added = (first + second)*2;
        System.out.print("Perimeter: ");
        System.out.println(added);
    }
}
