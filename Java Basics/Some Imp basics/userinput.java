import java.util.Scanner;/*this is for taking the user input in the java; or we can write it as =>
import java.util.*;*/

public class userinput {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);//user input scanner class;
            System.out.println("Enter Your string value");
            String input =sc.next(); //it will store the value upto where there is no spaces ex if give input atul khiyani output will be atul only for this we have to use sc.nextLine();*/

            //String input =sc.nextLine();//this will store full value
           int a= sc.nextInt();//for taking integer input
           float b= sc.nextFloat();//for floating values; 


            System.out.println(input);
            
      }
      
}
