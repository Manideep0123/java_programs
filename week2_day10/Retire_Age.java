//Write a Java program that prompts the user to enter their age and prints out the number of years left until they can retire (assuming retirement age is 65)
import java.util.Scanner;
public class Retire_Age{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int present_Age,remaining_Age;
    System.out.println("enter the present age");
    present_Age = sc.nextInt();
    remaining_Age = (65-present_Age);
      if(present_Age>65)
      System.out.println("already retired");
    else
       System.out.println("remaining age is"+ remaining_Age);
      
    
  }
}