import java.util.Scanner;

public class LetterGrade {
    // The method you write will return a String representing a letter
    // grade (e.g., "A", "A-", "B+", etc.).
    // The letter grade is determined by the given percentage, according
    // to the scale specified on page 2 of the class syllabus (available
    // here: https://kyledewey.github.io/comp110-spring18/syllabus.pdf).
    // You may assume that the given percentage is between 0.0 and 100.0
    // TODO - write your code below this comment.
    public static String letterGrade(double input) {
     if (input >= 92.5) {
      return "A";
     } else if (input >= 89.5){
         return "A-";
     }else if (input >= 86.5){
         return "B+";
     }else if (input >= 82.5){
         return "B";
     }else if (input >= 79.5){
         return "B-";
     }else if (input >= 76.5){
         return "C+";
     }else if (input >= 72.5){
         return "C";
     }else if (input >= 69.5){
         return "C-";
     }else if (input >= 66.5){
         return "D+";
     }else if (input >= 62.5){
         return "D";
     }else if (input >= 59.5){
         return "D-";
     }else {
         return "F";
     }
    
    }
    
    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter grade as percentage: ");
        double percentage = input.nextDouble();
        System.out.println("Letter grade: " + letterGrade(percentage));
    }
}
