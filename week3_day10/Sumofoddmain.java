import java .util.Scanner;
class Sumofodd{
  public void odd(){
    Scanner sc = new Scanner(System.in);
    int sum=0,n,i=1;
    System.out.println("enter the value of n");
    n= sc.nextInt();
    do
      {
        sum=sum+i;
        i=i+2;
      }
      while(i<=n);
    System.out.println(sum);
  }
}
public class Sumofoddmain{
  public static void main(String [] args){
    Sumofodd a = new Sumofodd();
    a.odd();
    
  }
}