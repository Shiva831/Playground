import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int a[] = new int[n];
       for(int i = 0; i <= n - 1; i++){
           a[i] = in.nextInt();
       }
        for(int j = 0;j <= n-2; j++)
        {
            for(int k = j+1;k<=n-1; k++)
            {
                for(int l=k+1;l<=n-1; l++)
                {
                    System.out.print("(" + a[j] + "," + " " + a[k] + "," + " " + a[l] + ")" + " ");
                }
            }
            System.out.println();
        }
      
    }
}