/*You are working on a stock market analysis tool that helps investors analyze historical stock prices. This tool allows users to input an array of stock prices for a specific stock and identifies the minimum and maximum prices to help users make informed investment decisions.You are tasked with writing a program in Java to accomplish this.*/
  import java.util.Scanner;
class StockMarket{
  public void maxMin(){
    Scanner sc=new Scanner(System.in);
    int arr[] = new int[5];
    System.out.println("enter the stock prices");
    for(int i=0;i<arr.length;i++)
      arr[i]=sc.nextInt();
    int max=arr[0];
    int min=arr[0];
    for(int i=0;i<arr.length;i++){
      if(max<arr[i])
        max=arr[i];
      if(min>arr[i])
        min=arr[i];
    }
    System.out.println("the minimum stock price is"+ min );
    System.out.println("the maximum stock price is"+ max );
  }
}
public class StockMarketmain{
  public static void main(String[] args){
    StockMarket a = new StockMarket();
    a.maxMin();
  }
}