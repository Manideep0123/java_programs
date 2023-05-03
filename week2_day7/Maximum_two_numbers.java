import java.util.Scanner;

public class Maximum_two_numbers {
  public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    int num1,num2;
    System.out.println("enter the values of num1 ,num2");
      num1=sc.nextInt();
     num2=sc.nextInt();
    if(num1>num2)
    {
     System.out.println("num1 is greater then num2" + (num1));
    }
    else
    {
       System.out.println("num2 is greater then num1" + (num2));
    }
  }
}
    
    