// TODO - write your code below this comment.
// As a hint, you will need to make SubOverride inherit
// from BaseOverride, and you'll need to override the
// overrideMe method to not produce any output.
//
// NOTE: you do not need to define your own construtor.
// Java will automatically introduce one which works
// effectively like the following code:
//
//    public SubOverride() {
//        super();
//    }
//
class BaseOverride{
   public void overrideMe() {
       System.out.println("BASE");
   }
}
   public class SubOverride extends BaseOverride {
   @Override
   public void overrideMe() {
   }


    // DO NOT MODIFY main!
    public static void main(String[] args) {
        SubOverride s = new SubOverride();
        s.overrideMe();
    }
}

