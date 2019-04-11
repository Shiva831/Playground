import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int mat1[][]=new int[r][c];
    int mat2[][]=new int[r][c];
    int sub[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
        mat1[i][j]=in.nextInt();
  }
   for(int a=0;a<r;a++)
   {
     for(int b=0;b<c;b++)
       mat2[a][b]=in.nextInt();
   }
    for(int l=0;l<r;l++)
    {
      for(int m=0;m<c;m++)
        sub[l][m]=mat1[l][m]-mat2[l][m];
    }
    for(int k=0;k<r;k++)
    {
      for(int p=0;p<c;p++)
        System.out.print(sub[k][p]+" ");
        System.out.println();
    }
  }
}

    
