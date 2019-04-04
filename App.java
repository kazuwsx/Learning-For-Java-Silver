class App {
  public static void main(String args[])  {
    double tax = 0.0;
    int year = Integer.parseInt(args[0]);
    //tax  = (year >= 2014) ? 0.08 : (year >= 1997) ? 0.05 : 0;
    if(year >= 2014) { tax = 0.08; }
    if(year >= 1997 && year < 2014){ tax = 0.05;}
    System.out.println(tax);
  }
}