import java.util.Scanner;
class Primenumber{
  public boolean isPrime(int number){
    int i=0, count=0;
    for(i=1;i<=number;i++){
      if(number%i==0){
        count++;
      }
    }
    if(count==2)
      return true;
    else
      return false;
  }
}
public class Primenumbermain{
  public static void main(String[] args){
    int number;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the the number");
    number=sc.nextInt();
    Primenumber a=new Primenumber();
    boolean b=a.isPrime(number);
    if(b)
      System.out.println("The given number "+number+" is prime number");
    else
      System.out.println("The given number "+number+" is not a prime number");
  }
}