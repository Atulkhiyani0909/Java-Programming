// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class arrbasic {

    static boolean is_sorted(int[] arr){

        boolean check =true;
        for(int i =1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                check =false;
                break;
            }
        }
        return check;
        /* Arr.sort(arr)*/  //this is use to sort the array
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /* counting the element in the array*/
//      int[] arr={1,5,6,7,8,5,5,5,5};
//      int n=5;
//      int count=0;
//      for(int i=0;i<arr.length;i++){
//          if(n==arr[i]){
//              count++;
//          }
//      }
//        System.out.println("Your count is :: " + count );

        /*Finding the no. in the array*/

        int[] arr={1,2,3,4,5,6,70,8,90,876,2434};
//        System.out.println("Enter a number to find" );
       // int n=sc.nextInt();
//        int ans=-1;
//        for(int i=0;i<arr.length;i++){
//            if(n==arr[i]){
//                ans=i;
//                break;
//            }
//        }
//        System.out.println("Founded at index :" + ans);


        /*count the elements greater than input*/
//        int n=sc.nextInt();
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>n){
//                count++;
//            }
//
//
//        }
//        System.out.println(count);

        /*Array is sorted or not*/
        System.out.println("Is sorted " + is_sorted(arr) );


      //  int[] arr2=arr.clone();//deep copy is made of arr in arr2
        }



}