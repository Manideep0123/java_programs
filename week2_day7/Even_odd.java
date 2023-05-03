import java.util.Scanner;

public class Even_odd {
public static void main (String[] args){
  Scanner sc=new Scanner(System.in);
  int a;
  System.out.println("enter value of a");
  a=sc.nextInt();
  if(a%2==0)
     {
     System.out.println("the number is even");
     }
  else
  {
     System.out.println("the number is odd");
  }
}
}