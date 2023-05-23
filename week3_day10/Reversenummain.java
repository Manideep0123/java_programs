import java.util.Scanner;
class Reversenum{
  public void Reverse(){
    Scanner sc= new Scanner(System.in);
    int n,reverse_num=0,digit;
    System.out.println("enter the num");
    n=sc.nextInt();
    do{
      digit=n%10;
      reverse_num=reverse_num*10+digit;
      n=n/10;
    }
      while(n>0);
    System.out.println(reverse_num);
  }
}
public class Reversenummain{
  public static void main(String [] args){
  Reversenum a = new Reversenum();
  a.Reverse();
  }
}