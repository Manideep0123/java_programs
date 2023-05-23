import java.util.Scanner;
class Reversenum1{
  public void natural(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the n");
    int n= sc.nextInt();
    int reverse_num=0,digit;
    for(;n>0;n=n/10)
      {
        digit=n%10;
        reverse_num=reverse_num*10+digit;
      }
    System.out.println(reverse_num);
  }
}
public class Reversenummain1{
  public static void main(String [] args){
    Reversenum1 a =new Reversenum1();
    a.natural();
  }
}