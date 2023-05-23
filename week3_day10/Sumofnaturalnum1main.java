import java.util.Scanner;
class Sumofnaturalnum1{
  public void natural(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the n");
    int n= sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++)
      {
        sum=sum+i;
      }
    System.out.println(sum);
  }
}
public class Sumofnaturalnum1main{
  public static void main(String [] args){
    Sumofnaturalnum1 a = new Sumofnaturalnum1();
    a.natural();
  }
}