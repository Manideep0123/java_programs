import java.util.Scanner;
public class Assendingmain{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    int arr[]= new int[5];
    int temp=0;
    System.out.println("enter the elements");
    for(int i=0;i<arr.length;i++)
      arr[i]=sc.nextInt();
    for(int i=0;i<arr.length;i++)
       for(int j=i+1;j<arr.length;j++){
           if(arr[i]>arr[j]){
          temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
           }
           
       }
         
   
      
  }
  
}