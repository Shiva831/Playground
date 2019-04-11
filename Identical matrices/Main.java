import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here
                    int i, j;
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
    int[][] matrix1=new int[r][c];
        for(i = 0; i < r; i++)
        {
            for(j = 0; j < c; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
    int a,b;
            for(a = 0; a < r; a++)
        {
            for(b = 0; b < c; b++)
            {
                matrix1[a][b] = sc.nextInt();
            }
        }
    int flag=0;
    for(int l=0;l<r;l++)
    {
      for(int m=0;m<c;m++)
      {
        if(matrix[l][m]!=matrix1[l][m])
        {
          flag=1;
          break;
        }
      }
    }
    if(flag==0)
      System.out.print("Yes");
    else
      System.out.print("No");
  }
}

  
