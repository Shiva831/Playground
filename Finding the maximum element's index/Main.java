import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int t;
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=in.nextInt();
  }
    int max=a[0];
    int index=0;
    for(int j=0;j<n;j++)
    {
      if(max < a[j])
      {
        max=a[j];
        index=j;
      }
    }
    System.out.println(index);
  }
}

