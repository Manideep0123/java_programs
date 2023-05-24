import java.util.Scanner;
class Reverse{
  public void m1(){
    Scanner sc=new Scanner(System.in);
    String str1="";
    System.out.println("enter the string");
    String str=sc.nextLine();
    for(int i=str.length()-1;i>=0;i--){
      char ch=str.charAt(i);
      str1=str1+ch;
    }
    System.out.println("string after reverse");
    System.out.println(str1);
  }
}
public class Reverse_String{
  public static void main(String [] args){
    Reverse a=new Reverse();
    a.m1();
  }
}
    