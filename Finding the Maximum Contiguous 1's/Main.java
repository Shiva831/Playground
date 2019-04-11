import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
       Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int i,j;
    for(i=0;i<n;i++)
      a[i]=sc.nextInt();
    int count=0;
      for(j=0;j<n;j++)
      {
        if(a[j]==1 && a[j+1]==1)
          count++;
        else
          break;
      }
      System.out.println(count+1);
}}