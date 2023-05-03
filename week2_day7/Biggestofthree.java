import java.util.Scanner;

public class Biggestofthree {
  public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
   long num1,num2,num3,reslut;
    System.out.println("enter the values of num1 ,num2 ,num3");
      num1=sc.nextLong();
     num2=sc.nextLong();
    num3=sc.nextLong();
    reslut=(num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3);
    System.out.println("biggest of three numbers is "+ (reslut));
  }
}