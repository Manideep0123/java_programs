import java.util.Scanner;
class Odd{
  public boolean isOdd(int number1){
    if(number1%2==0)
      return false;
    else
      return true;
  } 
}
class Even{
  public boolean isEven(int number2){
    if(number2%2==0)
      return true;
    else
      return false;
  }
}
class Primenumber{
  public boolean isPrime(int number3){
    int i=0, count=0;
    for(i=1;i<=number3;i++){
      if(number3%i==0){
        count++;
      }
    }
    if(count==2)
      return true;
    else
      return false;
  }
}
class Perfectnumber{
  public boolean isPerfect(int number4){
  int sum=0,i=1;
  for(i=1;i<number4;i++){
  if(number4%i==0){
  sum=sum+i;
  }
  }
if(sum==number4)
  return true;
else
  return false;
}
}
public class Allmain{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter 1: for checking whether number is odd ");
    System.out.println("enter 2: for checking whether number is even ");
    System.out.println("enter 3: for checking whether number is prime");
    System.out.println("enter 4: for checking whether number is perfect");
    System.out.println("enter the n");
    n= sc.nextInt();
    switch(n){
      case 1:
        int number1;
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the the number");
        number1=sn.nextInt();
          Odd a= new Odd();
          boolean b = a.isOdd(number1);
          if(b){
            System.out.println("The given number "+number1+" is Odd number");}
          else
      System.out.println("The given number "+number1+" is not a Odd number");break;
      case 2:
        int number2;
        Scanner sm=new Scanner(System.in);
        System.out.println("Enter the the number");
        number2=sm.nextInt();
          Even c= new Even();
          boolean d = c.isEven(number2);
          if(d)
      System.out.println("The given number "+number2+" is Even number");
    else
      System.out.println("The given number "+number2+" is not a Even number");break;
      case 3:
        int number3;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the the number");
        number3=s.nextInt();
        Primenumber e= new Primenumber();
        boolean f = e.isPrime(number3);
        if(f)
          System.out.println("The given number "+number3+" is prime number");
        else
          System.out.println("The given number "+number3+" is not a prime number");break;
      case 4:
        int number4;
        Scanner so=new Scanner(System.in);
        System.out.println("Enter the the number");
        number4=so.nextInt();
        Perfectnumber g= new Perfectnumber();
        boolean h = g.isPerfect(number4);
        if(h)
          System.out.println("The given number "+number4+" is Perfect number");
        else
          System.out.println("The given number "+number4+" is not a Perfect number");break;
      default:
          System.out.println("enter the valid num"); 
    }
  }
}