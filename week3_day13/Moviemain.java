import java.util.Scanner;
class Movie{
  public void average(){
    Scanner sc =new Scanner(System.in);
    int arr[][]=new int[3][4];
    float average;
    System.out.println("enter the elements");
    for(int i=0;i<3;i++)
      for(int j=0;j<4;j++)
        arr[i][j]=sc.nextInt();
    average=((arr[0][0]+arr[0][1]+arr[0][2]+arr[0][3]+
      arr[1][0]+arr[1][1]+arr[1][2]+arr[1][3]+arr[2][0]+
      arr[2][1]+arr[2][2]+arr[2][3])/12);
    if(arr[0][1]>arr[0][2]&&arr[0][1]>arr[0][3])
      System.out.println("highest in movie 1 is"+arr[0][1]);
    else if(arr[0][2]>arr[0][1]&&arr[0][2]>arr[0][3])
      System.out.println("highest in movie 1 is"+arr[0][2]);
    else
      System.out.println("highest in movie 1 is"+arr[0][3]);
    System.out.println("average is:"+average);
  }
}
public class Moviemain{
  public static void main(String [] args){
    Movie a=new Movie();
    a.average();
  }
}
