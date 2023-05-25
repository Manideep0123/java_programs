import java.util.Scanner;
class Encrypted {
  public void a1 (){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String str1=sc.nextLine();
    int a=3,b=0;
    String str2="";
    for(int i=0;i<str1.length();i++){
      char ch =str1.charAt(i);
      b=ch+a;
      if(b>'z'){
        b=b-'z'+96;
        
      }
     System.out.print((char)b);
    }
   
  }
}
  public class Encryptedmain{
    public static void main(String[] args){
      Encrypted s= new Encrypted();
       s.a1 ();
    }
  }
 