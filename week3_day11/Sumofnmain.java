
import java.util.Scanner;
class Sumofn{
  public int sum(){
    int n,sum=0,i=1;
    System.out.println("enter the n");
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    while(i<=n)
      {
        if(i%2!=0)
          continue;
        sum=sum+i;
        i=i++;
      }
    return sum;
  }
}
public class Sumofnmain{
  public static void main(String [] args){
    Sumofn a = new Sumofn();
    int b = a.sum();
    System.out.println(b);
  }
}