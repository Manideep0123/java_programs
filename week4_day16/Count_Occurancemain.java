import java.util.Scanner;
class Count_Occurance{
  public void m1(){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.nextLine();
    System.out.println("enter the character");
    int count=0;
    char ch=sc.next().charAt(0);
      for(int i=0;i<str.length();i++){
      if(ch==str.charAt(i))
        count++;
          }
  System.out.println(count);
      }
}
public class Count_Occurancemain{
  public static void main(String [] args){
    Count_Occurance a = new Count_Occurance();
    a.m1();
  }
}