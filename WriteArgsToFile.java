import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class WriteArgsToFile {
    // TODO - write your code below this comment
    //
    // You need to define a method to make this code compile and do
    // the right thing.  The method you define should write the
    // given command-line arguments to the given file.
    // This method should throw IOException if there is a problem.
    // Additionally, this should ALWAYS close the file, even
    // if there was a problem of some sort.  (Hint: use finally).
    //
   public static void writeArgsToFile(String[] s, File file) throws IOException {
      BufferedWriter bw = null;
      try{
         bw = new BufferedWriter(new FileWriter(file));
         for(int i = 0; i < s.length; i++){
            bw.write(s[i]);
            bw.newLine();
         }
      } finally {
         if (bw != null) {
            bw.close();
         }
      }
   }
    
    // DO NOT MODIFY main!
    public static void main(String[] args)
        throws IOException {
        writeArgsToFile(args, new File("args.txt"));
    }
}