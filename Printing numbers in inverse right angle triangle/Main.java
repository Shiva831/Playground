import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i,j,k;
      for(i=1;i<=n;i++)
      {
        k=n+1-i;
        for(j=1;j<=n;j++)
        {
          if(j<=n+1-i){
            System.out.print(k);
            k--;
          }
          else
            System.out.print(" ");
        }
        System.out.print("\n");
      }
    }
}

