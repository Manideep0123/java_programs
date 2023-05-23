import java.util.Scanner;
class Sumofpositivenum{
  public void positive(){
    Scanner sc=new Scanner(System.in);
    int n,sum=0,digit;
    System.out.println("enter the num");
    n= sc.nextInt();
    do{
      digit=n%10;
      sum=sum+digit;
      n=n/10;
    }
      while(n>0);
    System.out.println(sum);
  }
}
public class Sumofpositivenummain{
  public static void main(String [] args){
    Sumofpositivenum a = new Sumofpositivenum();
    a.positive();
  }
}