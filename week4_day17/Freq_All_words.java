import java.util.Scanner;
class Freq_All_word{
  public void freq(){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");
      String str1=sc.nextLine();
    String a[]=str1.split(" ");
      for(int i=0;i<a.length;i++){
        
      int count;
        System.out.println("character   count");
         boolean visited[] = new boolean[a.length];
        for ( i = 0; i < a.length; i++) {
          if (visited[i] == true)
            continue;
          count = 1;
          for (int j = i + 1; j < a.length; j++) {
            if (a[i]==a[j]) {
              count = count + 1;
              visited[j] = true;
            }
          }
          System.out.println(a[i]+"\t\t"+count);
        }
    }
    
  }
}
   public class Freq_All_words{
  public static void main(String[] args){
    Freq_All_word a=new Freq_All_word();
    a.freq();
  }
}   
      
  
