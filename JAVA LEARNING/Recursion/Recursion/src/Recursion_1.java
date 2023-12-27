
import java.util.Scanner;
public class Recursion_1 {
// static void printIncreasing(int n){
//
//
//     if(n==1){
//         System.out.println(n );
//         return;
//     }
//     printIncreasing(n-1);//this function is calling itself again and again
//     System.out.println(n);//this worksas a stack on last in first out principle
// }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n " );
//int n= sc.nextInt( );
//printIncreasing(n);
        System.out.println("Enter the size of the array " );
int c=sc.nextInt();
        int[] arr = new int[c];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt( );
        }
        int b = 0;
        while (b < arr.length) {
            System.out.println("Enter value of j");
            int j = sc.nextInt( );

            for (int a = arr.length - 1; a > j; a--) {
                arr[a] = arr[a - 1];
            }
            System.out.println("Enter value of n ");
            int n = sc.nextInt( );
            arr[j] = n;
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            b++;
        }
    }
  }



