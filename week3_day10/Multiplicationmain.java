import java.util.Scanner;
class Multiplication{
  public void mul(){
    Scanner sc = new Scanner(System.in);
    int n,digit=1,result;
    System.out.println("enter the value of n");
    n = sc.nextInt();
    do
      {
        result=n*digit;
        System.out.println(n+"*"+digit+"="+result);
        digit=digit+1;
      }
      while(digit<=10);
  }
}
public class Multiplicationmain{
  public static void main(String [] args){
    Multiplication a = new Multiplication();
    a.mul();
  }
}