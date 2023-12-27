import java.util.Scanner;

public class reverseno {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
          //int lastdigit;
          int reverse=0;
          int remainder;
            
            while(n>0){
                  remainder=n%10;
                  //lastdigit=n%10;
                  //or to store the value of last digit in another var we have to write.
                  reverse =reverse*10+remainder;

                 //System.out.print(reverse);
                  n=n/10;
            }
            System.out.println(reverse);
      }
}
