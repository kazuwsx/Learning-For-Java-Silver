class IfTest {
  public static void main(String[] args) {
    String valid = "true";
    //コンパイルエラーが発生
    if(valid) {
      System.out.println("valid");
    } else {
      System.out.println("not valid");
    }
  }
}