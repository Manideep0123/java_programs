import java.util.Scanner;
public class Uppercase_lowercase
{
    public static void main(String args[])
    {
        char c;
        Scanner s=new Scanner(System.in);
        System.out.println("enter any  character");
        c=s.next().charAt(0);
        
        if( (c >= 'a' && c <= 'z'))
                    System.out.println(c + " is an lower case  .");
            else if( (c >= 'A' && c <= 'Z'))
          System.out.println(c + " is an upper case  .");
      else
             System.out.println(c + " it is not an alphabet  ."); 
    }
}
          