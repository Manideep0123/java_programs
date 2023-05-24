 import java.util.Scanner;
class CountChar{
  public void count(){
    Scanner sc=new Scanner(System.in);
    int count=0;
    System.out.println("enter the string");
    String str=sc.nextLine();
    for(int i=0;i<str.length();i++){
      count++;
    }
     System.out.println(count); 
   }
}
public class CountCharmain{
  public static void main(String [] args){
    CountChar a=new CountChar();
    a.count();
  }
}