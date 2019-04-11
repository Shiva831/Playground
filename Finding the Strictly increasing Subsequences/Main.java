import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    int l=a[n-1];
    for(int j=0;j<n;j++)
    {
      for(int k=j+1;k<n;k++)
      {
        if((a[j]<a[k])&&((l-a[k])!=4))
          System.out.println(a[j]+","+a[k]); 
      }
    }
  }
}