import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int count=0;
      for(int j=0;j<n;j++)
        if(a[j]!=0)
          a[count++]=a[j];
          while(count<n)
            a[count++]=0;
  for(int m=0;m<n;m++)
    System.out.print(a[m]+" ");
}}
