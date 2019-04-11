import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
                int i, j;
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for(i = 0; i < r; i++)
        {
            for(j = 0; j < c; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
    for(int a=r-1;a>=0;a--)
    {
      for(int b=0;b<=c-1;b++)
      {
        System.out.print(matrix[b][a]+" ");
      }
      System.out.println();
    }
  }
}

  