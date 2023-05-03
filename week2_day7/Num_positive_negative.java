import java.util.Scanner;

public class Num_positive_negative {
  public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
   int a;
    System.out.println("enter the value of a ");
    a = sc.nextInt();
    if(a>=0)
    {
     System.out.println("positive number is ");
    }
    else if(a<0)
    {
   System.out.println("negative number is ");
    }
    else
      {
      System.out.println("number is zero ");
    }
  }
}