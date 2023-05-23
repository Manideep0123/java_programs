import java.util.Scanner;
class Sumofeven{
  public void sum(){
    Scanner sc = new Scanner(System.in);
    int sum=0,n,i=2;
    System.out.println("enter the value of n");
    n = sc.nextInt();
    do{
      sum=sum+i;
      i=i+2;
    }
      while(i<=n);
    System.out.println(sum);
  }
}
public class Sumofevenmain{
  public static void main(String [] args){
  Sumofeven a = new Sumofeven();
  a.sum();
  }
}
  