import java.util.Scanner;
class Productofadigit{
  public void product(){
    int n,product=1,digit;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the num");
    n=sc.nextInt();
    do{
      digit=n%10;
      product=product*digit;
      n=n/10;
    }
      while(n>0);
    System.out.println(product);
  }
}
public class Productofadigitmain{
  public static void main(String [] args){
    Productofadigit a = new Productofadigit();
    a.product();
  }
}