import java.util.Scanner;
public class Sumofnaturalnum{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int sum=0,i=1,n;
    System.out.println("enter the value of n");
    n = sc.nextInt();
    do
      {
        sum = sum+i;
        i=i+1;
      }
        while(i<=n);
      System.out.println(sum);
    
      }
    }
    