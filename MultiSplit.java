public class MultiSplit {
    // TODO - write your code below this comment.
    // You will need to write two methods:
    //
    // 1.) A method named multiSplit which will take an
    //     array of strings, as well as a String specifying
    //     the regular expression to split on.
    //     The method returns a two-dimensional array, where each
    //     element in the outer dimension corresponds to one
    //     of the input Strings.  For example:
    //
    //     multiSplit(new String[]{"one,two", "three,four,five"}, ",")
    //
    //     ....returns...
    //
    //     { { "one", "two" }, { "three", "four", "five" } }
    //
    // 2.) A method named printSplits which will take the sort
    //     of splits produced by multiSplit, and print them out.
    //     Given the example above, this should produce the following
    //     output:
    //
    //     0: one two
    //     1: three four five
    //
    //     Each line is permitted (but not required) to have a trailing
    //     space (" "), which may make your implementation simpler.
    //
    public static String[][] multiSplit(String[] args , String splitter){
        String[][] data = new String[args.length][];
        for (int i = 0; i < args.length; i++) {
            data[i]= args[i].split(splitter);

                    }
        return data;
    }

    public static void printSplits(String[][] a){
       for (int i = 0; i < a.length; i++) {
           System.out.print(i + ": ");
           for (int j = 0; j < a[i].length; j++) {
               if (a[i][j] != null){
                   System.out.print(a[i][j] + " ");
               }
           }
           System.out.println();
       }
    }



    // DO NOT MODIFY main!
    public static void main(String[] args) {
        String[][] splits = multiSplit(args, ",");
        printSplits(splits);
    }
}