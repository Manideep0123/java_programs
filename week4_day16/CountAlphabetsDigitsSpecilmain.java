import java.util.Scanner;
class CountAlphabetsDigitsSpecil{
  public void count(){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.nextLine();
    int alphapets=0;
    int digits=0;
    int special=0;
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
        alphapets++;
      else if(ch>='0'&&ch<='9')
        digits++;
      else
        special++;
    }
    System.out.println("alphapets count is"+alphapets);
    System.out.println("digits count is"+digits);
    System.out.println("special symbols count is"+special);
  }
}
public class CountAlphabetsDigitsSpecilmain{
  public static void main(String [] args){
    CountAlphabetsDigitsSpecil a =new CountAlphabetsDigitsSpecil();
    a.count();
  }
}