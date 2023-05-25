import java.util.Scanner;
class Freq_Oflast{
  public void freqOflast(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String str1=sc.nextLine();
    String a[]=str1.split(" ");
    String lastword=a[a.length-1];
    for(int i=0;i<lastword.length();i++){
      char ch=lastword.charAt(i);
      
      int count;
        System.out.println("character   count");
         boolean visited[] = new boolean[lastword.length()];
        for ( i = 0; i < lastword.length(); i++) {
          if (visited[i] == true)
            continue;
          count = 1;
          for (int j = i + 1; j < lastword.length(); j++) {
            if (lastword.charAt(i) == lastword.charAt(j)) {
              count = count + 1;
              visited[j] = true;
            }
          }
          System.out.println(lastword.charAt(i)+"\t\t"+count);
        }
    }
    
  }
}
public class Freq_Oflastmain{
  public static void main(String[] args){
    Freq_Oflast a=new Freq_Oflast();
    a.freqOflast();
  }
}