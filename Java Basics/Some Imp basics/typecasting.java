
import java.util.Scanner;
public class typecasting {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            /* It is used to convert any other data type to another data type forcefully java it losses some of its value and bit */

            float a=90.7878f;
            int b=(int)a;  //by this it will forcefully convert the float data type to int;

            System.out.println(b);


            char ch='a';
            int num =ch;//it convert it to its ASCII value;
            System.out.println(num);
            

      }
}

