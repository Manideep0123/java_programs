//print 1 to n natural numbers in reverse
import java.util.Scanner;
class PrintNnumber{
  public void print(){
    int n;
    System.out.println("enter the n");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    while(n>=1){
      System.out.println(n);
      n--;
      }
  }
}
public class PrintNnumbersmain{
  public static void main(String [] args){
    PrintNnumber a = new PrintNnumber();
    a.print();
  }
}