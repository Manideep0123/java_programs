import java.util.Scanner;
public class Calculatebmi{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    double height,weight,bmi;
    System.out.println("enter the height and weight");
    height = sc.nextDouble();
    weight = sc.nextDouble();
    bmi = (weight/(height*height));
    if(bmi<18)
      System.out.println("underweight");
    else if(bmi<25)
      System.out.println("healthy");
    else if(bmi<30)
      System.out.println("overweight");
    else
      System.out.println("obessity");
  }
}