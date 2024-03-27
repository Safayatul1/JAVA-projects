public class StringExplode {
    // TODO - write your code below this comment.
    // You will need to write a method that takes a string and
    // returns an array of the characters in that String.
    //
    // You may (and will need) to use the charAt and length
    // methods of String.  You may NOT use any other methods
    // of String.
    //
    public static char[] explode(String arry) {
    char[] result = new char[arry.length()];
    for (int i = 0; i < arry.length(); i++){
        result[i] = arry.charAt(i);

      }
      return result;
    }

    // DO NOT MODIFY printArray!
    public static void printArray(char[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        char[] exploded = explode(args[0]);
        printArray(exploded);
    }
}