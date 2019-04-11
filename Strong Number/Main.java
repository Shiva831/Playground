import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int on=n;
      int r,s=0;
      while(n!=0)
      {
        int i=1,f=1;
        r=n%10;
        while(i<=r)
        {
        f=f*i;
          i++;
	}
        s=s+f;
        n=n/10;
      }
      if(on==s)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}