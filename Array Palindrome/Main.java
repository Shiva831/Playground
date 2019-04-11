import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i<= n - 1; i++){
            a[i] = sc.nextInt();
        }
      int l=0;
      int r=n-1;
      boolean is_true=true;
      while(l<r)
      {
        if(a[l]!=a[r])
        {
          is_true=false;
          break;
        }
        l++;
        r--;
      }
      if(is_true==true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}

   