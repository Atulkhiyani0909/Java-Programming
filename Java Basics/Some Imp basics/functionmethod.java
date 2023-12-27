import java.util.*;

public class functionmethod {
      static void print() {
            System.out.println("Hello World!");
          } // a function
     int add(int a,int b){
           int ans =a+b;
           return ans;
      } //its return type is void as it doent return any value; if we write int instead of void we must have to give it return type. ex return 1 0r 2 how many time we want to return.

  
      public static void main(String[] args) {
            /* in this above line main is the function and its return type is void that it doesnt return any value of it and main input is String argument nam ki  */

            //syntax of the function
            functionmethod algebra =new functionmethod();
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
           System.out.println( algebra.add(x,y));


           print();//calling  A FUNCTION;



         
          

      }
}
