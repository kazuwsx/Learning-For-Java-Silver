class EqualsTest {
  public static void main(String[] args) {
    String str1 = "Hello!";
    String str2 = new String("Hello!");
    //==演算子 参照変数が同一のオブジェクトを参照していればtrue
    if(str1 == str2)
      System.out.println("match!");
    //Stringクラスのequals()メソッド オブジェクトが保持している文字列が同じであればtrue
    if(str1.equals(str2))
      System.out.println("really match");
  }
}
