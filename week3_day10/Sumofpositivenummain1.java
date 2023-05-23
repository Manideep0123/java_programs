import java.util.Scanner;
class Sumofpositivenum1{
  public void positive(){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number n");
   int n=sc.nextInt();
    int sum=0;
    for(int digit;n>0;n=n/10)
      {
        digit=n%10;
        sum=sum+digit;
      }
    System.out.println(sum);
  }
}
public class Sumofpositivenummain1{
  public static void main(String [] args){
    Sumofpositivenum1 a = new Sumofpositivenum1();
    a.positive();
  }
}