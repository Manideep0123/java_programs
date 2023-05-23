import java.util.Scanner;
class PrintAlphabet{
  public void print(){
    char c;
    char b;
    /*System.out.println("enter the ch");
    Scanner sc=new Scanner(System.in);
    ch=sc.next().charAt(0);*/
    for(c='a';c<='z';c++){
      System.out.println(c);
    }
    for(b='A';b<='Z';b++){
       System.out.print(b);
    }
  }
}
public class PrintAlphabetsmain{
  public static void main(String [] args){
    PrintAlphabet a = new PrintAlphabet();
    a.print();
  }
}