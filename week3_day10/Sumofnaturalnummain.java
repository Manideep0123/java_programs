import java.util.Scanner;
class Sumofnaturalnum{
  public void sums(){
   int n,i=1,sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of n");
    n=sc.nextInt();
      do
        {
          sum=sum+i;
          i=i+1;
        }
        while(i<=n);
        System.out.println(sum);
  }
}
    public class Sumofnaturalnummain{
      public static void main(String [] args){
        Sumofnaturalnum a= new Sumofnaturalnum();
        a.sums();
      }
    }
    
