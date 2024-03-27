import java.util.Scanner;

public class DegreeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        // TODO - write your code below this comment
       Scanner calc = new Scanner(System.in);
      double Celsius = in.nextDouble();
        double Fahrenheit = ((Celsius * 1.8) + 32);
        System.out.print("Fahrenheit: " + Fahrenheit);
    
    }
}
