class Calc3 {
  public static void main(String[] args) {
    int i = 10;
    int i2 = 20;

    if(i == 10) {
      System.out.println("i==10 ");
      if(i2 == 20) {
        //break文は、ループ文またはswitch文でしか使用できないためコンパイルエラーが発生する
        break;
      }
      System.out.println("i=20");
    }
  }
}