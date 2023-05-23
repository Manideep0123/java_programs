import java.util.Scanner;
public class MaxandMin_Num{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the three numbers");
      int num1= sc.nextInt();
    int num2= sc.nextInt();
    int num3= sc.nextInt();
    if(num1>num2&&num1>num3)
      System.out.println("num1 is max");
    else if(num2>num1&&num2>num3)
      System.out.println("num2 is max");
    else
      System.out.println("num3 is max");
    if(num1<num2&&num1<num3)
      System.out.println("num1 is min");
    else if(num2<num1&&num2<num3)
      System.out.println("num2 is min");
    else
      System.out.println("num3 is min");
  }
}