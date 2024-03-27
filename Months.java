import java.util.Scanner;

public class Months {
    // You will need to write a method that makes this
    // code compile and produce the correct output.
    // YOU MUST USE switch!
    // TODO - write your code below this comment.

    // DO NOT MODIFY main!
    public static String monthAsString(int month){
      switch (month){
         case 0:
            return "January";
         case 1: 
            return "February";
         case 2:
            return "March";
         case 3:
            return "April";
         case 4:
            return "May";
         case 5:
            return "June";
         case 6:
            return "July";
         case 7:
            return "August";
         case 8:
            return "September";
         case 9:
            return "October";
         case 10:
            return "November";
         case 11: 
            return "December";
         default:
            return "Invalid month: " + month; 
      
      
      
      }
    
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month (0-11): ");
        int month = input.nextInt();
        String output = monthAsString(month);
        System.out.println(output);
    }
}
