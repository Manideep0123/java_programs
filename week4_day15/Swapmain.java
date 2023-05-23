import java.util.Scanner;
class Swap{
  public int[] m1(int a[]){
    int temp=0;
    for(int i=0,j=a.length-1;i<j;i++,j--){
      temp=a[i];
      a[i]=a[j];
      a[j]=temp;
    }
    return a;
  }
}
public class Swapmain{
  public static void main(String [] args){
    int arr[]=new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the array elements");
    for(int i=0;i<arr.length;i++)
      arr[i]=sc.nextInt();
    Swap a =new Swap();
    a.m1(arr);
    System.out.println("array after reverse");
    for(int i=0;i<arr.length;i++)
      System.out.println(arr[i]);
    
  }
}