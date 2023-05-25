import java.util.Scanner;
class DifferenceOf{
  public void first_Last(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String str1=sc.nextLine();
    String a[]=str1.split(" ");
    int b=a[0].length();
    int c=a[a.length-1].length();
    System.out.println("difference is"+(b-c));
  }
}
public class DifferenceOfmain {
  public static void main(String[] args){
    DifferenceOf d =new DifferenceOf();
    d.first_Last();
  }
}