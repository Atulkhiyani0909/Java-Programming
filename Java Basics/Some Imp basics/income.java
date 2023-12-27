import java.util.*;
public class income {
      public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter Your Income :: ");
            int income =sc.nextInt();
            int tax=0;

            if(income<=500000){
                  tax=(income*0)/100;
                  income =income-tax;
                  System.out.print("Your income is :: ");
                  System.out.println(income);


            }
            else if(income>=500000 && income<=1000000){
                   tax=(income*5)/100;
                  income =income-tax;
                  System.out.print("Your income is :: ");
                   System.out.println(income);
            }
            else{
                  tax=(income*30)/100;
                   income =income-tax;
                   System.out.print("Your income is :: ");
                    System.out.println(income);

            }
      }

      
}
