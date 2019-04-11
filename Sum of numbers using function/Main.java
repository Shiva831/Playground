import java.util.Scanner;
class Main{
  public static int sum(int num)
  {
    int i,s=0;
    for(i=1;i<=num;i++)
    {
      s=s+i;
    }
    return s;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = sum(n);
      System.out.println(k);
	}
}