class MultiArray2 {
  public static void main(String args[]) {
    int array2d[][] = new int[4][3];
    System.out.println("Load");
    for(int i = 0; i < array2d.length; i++) {
      for(int j = 0; j < array2d[i].length; j++) {
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        array2d[i][j] = i * j;
      }
    }
    System.out.println("Modify");
    for(int i = 0; i < array2d.length; i++) {
      for(int j = 0; j < array2d[i].length; j++) {
        array2d[i][j] = array2d[i][j] + 1;
      }
    }
  }
}