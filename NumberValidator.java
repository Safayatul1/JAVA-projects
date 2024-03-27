// Define an abstract class named NumberValidator.
// This class defines the following methods:
//
// 1.) An abstract method named numberValid, which takes
//     an int and returns a boolean.  It should have
//     protected visibility.
//
// 2.) An abstract method named numberInvalidMessage,
//     which takes an int and returns a String.  It should
//     have protected visibility.
//
// 3.) A method named parseNumber, which takes a String and returns
//     an int.  This method needs to do the following:
//     1. Parse the input to an int, using Integer.parseInt.
//        If Integer.parseInt throws a NumberFormatException,
//        then parseNumber should throw an InvalidNumberException,
//        where the message in the InvalidNumberException should be
//        derived from calling toString() on the NumberFormatException.
//     2. Call numberValid with the parsed integer.  If numberValid
//        returns false, this should throw an InvalidNumberException.
//        The message in the InvalidNumberException should be derived
//        by calling numberInvalidMessage with the parsed integer.
//     3. If a InvalidNumberException exception wasn't thrown, the
//        parsed integer should be returned.
//
public abstract class NumberValidator {
      public int parseNumber(String input) throws InvalidNumberException {
         try {
            int retval = Integer.parseInt(input);
         if(!numberValid(retval)) {
            throw new InvalidNumberException(numberInvalidMessage(retval));
            } else {
               return retval;
             }
          } catch
        (NumberFormatException e) {
            throw new InvalidNumberException(e.toString());
            }
         }
       protected abstract boolean numberValid(int num);
         protected abstract String
         numberInvalidMessage(int num);
        }
