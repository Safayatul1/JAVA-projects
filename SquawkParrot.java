import java.util.Scanner;

public class SquawkParrot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter something to repeat: ");
        String line = in.nextLine();
        System.out.println("BRAAWK "+line+"!");
        

    }
}
