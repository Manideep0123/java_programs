import java.util.Scanner;
class Palindrome{
  public void m1(){
    Scanner sc= new Scanner(System.in);
    int x=0;
    System.out.println("enter the string");
    String str=sc.nextLine();
    for(int i=0,j=str.length()-1;
       i<j;i++,j--){
      if(str.charAt(i)!=str.charAt(j)) {
        System.out.println("is not a palindrom");
        x=1;}
      
       }
      if(x==0)
      System.out.println("palindrom");
  }
  }
public class Palindromemain{
  public static void main(String[] args){
    
    Palindrome a=new Palindrome();
    a.m1();
  
  }
  
}
