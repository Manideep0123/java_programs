import java.util.Scanner;
class Last_Occurance{
  public void m1(){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.nextLine();
    System.out.println("enter the character");
    char ch=sc.next().charAt(0);
    System.out.println(str.lastIndexOf(ch));
  }
}
public class Last_Occurancemain{
  public static void main(String[] args){
    Last_Occurance a= new Last_Occurance();
    a.m1();
  }
}