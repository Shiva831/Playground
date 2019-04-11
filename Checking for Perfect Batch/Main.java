import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=in.nextInt();
  }
    if((a[0]+a[1]+a[2])==a[3]+a[4]+a[5])
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}

