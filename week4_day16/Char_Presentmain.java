import java.util.Scanner;
class Char_Present{
  public boolean present(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string");
    String str = sc.nextLine();
    System.out.println("enter the character");
    char character = sc.next().charAt(0);
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(ch==character)
        return true;
      else
        return false;
    }
  }
}
public class Char_Presentmain{
  public static void main(String [] args){
    Char_Present a = new Char_Present();
    boolean b=a.present();
    if(b)
      System.out.println(character + "is present in the string"+" at index of" + i);
    else
      System.out.println("character is not present in the string");
  }
}