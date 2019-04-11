import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[20];
    int i,j;
    for(i=0;i<n;i++)
      a[i]=sc.nextInt();
    int sum,maxsum,k;
    sum=a[0];
    maxsum=a[0];
    for(k=1;k<n;k++)
    {
      if(a[k]>a[k-1])
      {
        sum+=a[k];
      }
      else
      {
        sum=a[k];
      }
      if(sum>maxsum)
      {
        maxsum=sum;
      }
    }
    System.out.println(maxsum);
  }
    
  }
