import java.util.Scanner;
import java.lang.Math;
public class Absolutevalue{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    int a,b;
    System.out.println("enter the values of a and b");
    a= sc.nextInt();
    b= sc.nextInt();
    System.out.println("absolute value of a is"+ (Math.abs(a)));
    System.out.println("absolute value of b is"+ (Math.abs(b)));
    System.out.println("square root of b is"+ (Math.sqrt(a)));
    System.out.println("square root of b is"+ (Math.sqrt(b)));
  }
}
    