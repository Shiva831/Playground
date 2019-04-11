import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String a=in.nextLine();
      int l=a.length();
      int end=l-1;
      int front=0;
      int flag=1;
      while(front<end)
      {
        if(a.charAt(front) != a.charAt(end))
        {
           flag=0;
          break;
        }
        front++;
        end--;
    } 
      if(flag==1)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}

