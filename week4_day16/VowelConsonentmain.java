import java.util.Scanner;
class VowelConsonent{
  public void vowel(){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.nextLine();
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        System.out.println("entered character is vowel");
      else
      System.out.println("entered character is consonant");
    }
  }
}
public class VowelConsonentmain{
  public static void main(String [] args){
    VowelConsonent a =new VowelConsonent();
    a.vowel();
  }
}