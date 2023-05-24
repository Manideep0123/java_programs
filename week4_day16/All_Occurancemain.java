import java.util.Scanner;
class All_Occurance{
  public void m1(){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.nextLine();
    System.out.println("enter the character");
    char ch=sc.next().charAt(0);
    for(int i=0;i<str.length();i++){
      if(ch==str.charAt(i))
        System.out.println(i);
    }  
  }
}
public class All_Occurancemain{
  public static void main(String [] args){
    All_Occurance a = new All_Occurance();
    a.m1();
  }
}
    