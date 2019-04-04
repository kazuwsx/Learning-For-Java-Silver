//if you do this program, an infiniti roop occurs.
class DoWhileTest5 {
  public static void main(String[] args) {
    boolean flag1 = false;
    boolean flag2 = true;
    do {
      System.out.print('A');
    } while(flag1 | flag2);
  }
}