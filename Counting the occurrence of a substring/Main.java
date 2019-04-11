import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String a=in.nextLine();
    String b=in.nextLine();
    int l=a.length();
    int k=b.length();
    int count=0;
    int i,j,m,flag;
    for(i=0;i<(l-k+1);i++)
    {
      flag=1;
      for(j=0;j<k;j++)
      {
        if(a.charAt(i+j)!=b.charAt(j))
        {
          flag=0;
        }
      }
      if(flag==1)
      {
        count++;
      }
    }
    System.out.println(count);
}
}

