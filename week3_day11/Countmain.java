import java.util.Scanner;
class Count{
  public void num(){
    int n,count=0;
    System.out.println("enter the n");
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    while(n!=0)
      //if(n%10>0)
    {
        count=count+1;
        n=n/10;
      }
    System.out.println(count);
  }
}
public class Countmain{
  public static void main(String [] args){
    Count a= new Count();
    a.num();
  }
}