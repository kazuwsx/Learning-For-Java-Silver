class ForTest3 {
  public static void main(String[] args) {
    for(int i = 0, j = 1; (i + j) % 3 != 0; i++, j++) {
      System.out.println(true);
    }
  }
}