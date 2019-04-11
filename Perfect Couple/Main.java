import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int a[] = new int[n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int sum=in.nextInt();
      for(int j=0;j<n;j++)
      {
        for(int k=j+1;k<n;k++)
        {
          if((a[j]+a[k])==sum)
            System.out.println(a[j]+","+" "+a[k]);
        }
      }
    }
}

      
   