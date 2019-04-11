import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int x= in.nextInt();
      int y = in.nextInt();
      int z = in.nextInt();
      if (x > y && x > z)
      System.out.println(x);
    else if (y > x && y > z)
      System.out.println(y);
    else if (z > x && z > y)
      System.out.println(z);
    else
       System.out.println("0");
    }
}