import java.util.Scanner;

public class Num_div_11_and_5 {
public static void main (String[] args){
  Scanner sc=new Scanner(System.in);
  int a;
  System.out.println("enter value of a");
  a=sc.nextInt();
  if(a%5==0 && a%11==0)
  {
    System.out.println("number is divisible by 5 and 11");
  }
  else
  {
    System.out.println("number is not divisble by 5 and 11");
  }
}
}
