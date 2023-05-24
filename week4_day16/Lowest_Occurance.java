import java.util.Scanner;
public class Lowest_occurancemain{
  public static void main(String[] args){
    Lowest_occurance ba=new Lowest_occurance();
    ba.count();
  }
}
class Lowest_occurance{
  public void count(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String str=sc.nextLine();
int x=str.length();
    char y=str.charAt(0);
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      int count=1;
        System.out.println("character   count");
         boolean visited[] = new boolean[str.length()];
        for ( i = 0; i < str.length(); i++) {
          if (visited[i] == true)
            continue;
          count = 1;
          for (int j = i + 1; j < str.length(); j++) {
            if (str.charAt(i) == str.charAt(j)) {
              count = count + 1;
              visited[j] = true;
            }
          }
          if(count<x){
        x=count;
      y=str.charAt(i);     
        }
        }
    }
    System.out.println(y+"\t\t"+x);
  }
}