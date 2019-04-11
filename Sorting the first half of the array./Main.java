import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
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
    for(int l=0;l<n;l++)
      System.out.print(a[l]+" ");
  }
}

 