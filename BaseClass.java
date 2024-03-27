public class BaseClass {
    // TODO - write your code below this comment.
    // As a hint, this will need to save the String
    // given in the constructor in order to print it
    // out later.
    String mystr;
    public BaseClass(String str) {
        this.mystr = str;
    }

    protected void printString() {
        System.out.println(mystr);
}
}
