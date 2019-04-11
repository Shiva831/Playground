import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int p=0;p<n;p++)
      a[p]=in.nextInt();
    int k=(n/2);
        for(int i=0;i<k;i++)
    {
      for(int j=i+1;j<k;j++)
      {
        if(a[i]>a[j])
        {
          int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
        }
    for(k=(n/2);k<n;k++)
    {
      for(int f=k+1;f<n;f++)
      {
        if(a[k]<a[f])
        {
          int t=a[k];
          a[k]=a[f];
          a[f]=t;
        }
      }
    }
    for(int r=0;r<n;r++)
      System.out.print(a[r]+" ");
  }
}
