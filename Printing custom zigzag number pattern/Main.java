import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i,j;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=n;j++)
        {
          if(i%2==0){
            if(j==1)
              System.out.print(i+1);
            else
              System.out.print(i);
          }
          else
          {
            if(j==n)
              System.out.print(i+1);
            else
              System.out.print(i);
          }
        }
        System.out.print("\n");
      }
    }
}
