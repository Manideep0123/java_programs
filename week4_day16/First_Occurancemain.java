import java.util.Scanner;
class First_Occurance{
  public void m1(){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.nextLine();
    System.out.println("enter the character");
    char ch=sc.next().charAt(0);
    System.out.println(str.indexOf(ch));
  }
}
public class First_Occurancemain{
  public static void main(String[] args){
    First_Occurance a= new First_Occurance();
    a.m1();
  }
}