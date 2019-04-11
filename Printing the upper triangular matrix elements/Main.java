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
    int a,b,d;
    for(d=0;d<c;d++)
    {
      for(a=0,b=d;b<c;a++,b++)
        System.out.print(matrix[a][b]+" ");
    }
  }
}

  