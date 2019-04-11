import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i,j;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=(2*n-1);j++)
        {
          if(j>=n+1-i && j<=n-1+i)
            System.out.print("*");
          else
            System.out.print(" ");
	}
        System.out.print("\n");
}
    }
}
