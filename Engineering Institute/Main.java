//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary(int basesal)
  {
    //write your Faculty class statements
    System.out.println("Base Salary:"+" "+ basesal);
  }
}
class CSE extends Faculty
{
  public void salary(int basesal)
  {
    //write your CSE class statements
    System.out.println("CSE Faculty:"+" "+(basesal+3000));
  }
}
class IT extends Faculty
{
  public void salary(int basesal)
  {
    //write your IT class statements
    System.out.println("IT Faculty:"+" "+(basesal+5000));
  }
}
class ECE extends Faculty
{
  public void salary(int basesal)
  {
    //write your ECE class statements
    System.out.println("ECE Faculty:"+" "+(basesal+4500));
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int basesal=in.nextInt();
    Faculty f=new Faculty();
    f.salary(basesal);
    CSE obj1=new CSE();
    obj1.salary(basesal);
    IT obj2=new IT();
    obj2.salary(basesal);
    ECE obj3=new ECE();
    obj3.salary(basesal);
    //implement your required concept here
  }
}