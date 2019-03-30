package pac1;
import pac1.pac2.*;
import pac1.pac2.Test2;


public class Test1 {
  public static void main(String[] args) {
    String str = "Hello";
    System.out.println(str);
    pac1.pac2.Test2 test2 = new pac1.pac2.Test2();
    test2.foo();
  }
}
