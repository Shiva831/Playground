import java.util.Scanner;
class Main{
  public static double power(int b,int e)
  {
    double k= Math.pow(b,e);
    return k;
  }
public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
        int m = in.nextInt();
        double c=power(n,m);
  System.out.println(c);
}
}

