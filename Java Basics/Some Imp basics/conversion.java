import java.util.*;
public class conversion {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            //decimal to binary
            System.out.println("Enter the num to convert it to the binary :: ");
            int decimal =sc.nextInt();
            int ans=0;//binary num
            int pw=1;//power of 10
            while(decimal>0){
                  int parity=decimal%2;
                  ans+=(parity*pw);
                  pw*=10;
                  
                  decimal/=2;
                  /* fibonacii series */
                  

                  
            }
            System.out.println(ans);

      }
}
