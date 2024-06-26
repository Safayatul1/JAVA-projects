// Define a class named PositiveNumber which inherits
// from NumberValidator.  It should override the
// abstract methods in NumberValidator to do the following:
//
// 1.) For numberValid, it should return true if the
//     input number is greater than 0.
//
// 2.) For numberInvalidMessage, it should return
//     the String "Not positive: NUM", where NUM is
//     the input number.
//
public class PositiveNumber extends NumberValidator {
      protected boolean numberValid(int num){
         return num > 0;
         }
      protected String
      numberInvalidMessage(int num) {
          return "Not positive:" + num;
          }
       }  
