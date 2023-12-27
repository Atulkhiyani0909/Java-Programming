import java.util.Scanner;
public class arrpracticeprob {

    /* Q program to find the repeated element in the array*/
//    static void check_it(int[] arr) {
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                    System.out.println(arr[i] + " & " + arr[j]);
//                }
//            }
//
//        }
//        System.out.println("Total repeated elements are : " + count);
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = {9,9,8,8,6,6,4,4,1,8,8,7,3,1,2};
//        check_it(arr);

        /* Q program to find the unique element in an array wich is in arr only one time*/
        /*Hint for this is that if arr[i] and arr[j] are equals make them -1 and then at end run a loop that gives positive number of an array it will auto print the unique number as it is not -1*/
    static void uniq_num(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;

                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                System.out.println( "Unique number of an array is " + arr[i] );
            }
        }
    }




    public  static void main(String[] args){
        int[] arr={1,2,2,3,3,4,4,6,6,7,7,1,90,80,100};
       uniq_num(arr);
}


        /*PROGRAM TO REVERSE AN ARRAY using another array*/
//    static void print_arr(int[] arr) {
//       for (int i = 0; i < arr.length; i++) {
//            System.out.print(" "+arr[i]+" ");
//        }
//
//    }
//
//    static int[] reverse_arr(int[] arr) {
//        int n = arr.length;
//        int[] ans = new int[n];
//        int j = 0;
//        for (int i = n - 1; i >= 0; i--) {
//            ans[j++] = arr[i];//value of j is increasing by 1 and i value decreases by value of 1
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] ans = reverse_arr(arr);
//        print_arr(ans);
//    }
//}


        /*reverse of an array without using another array*/
//    static void swapInArray(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//
//
//    }
//
//    static void reverse_arr(int[] arr) {
//        int i = 0, j = arr.length - 1;
//        while (i < j) {
//            swapInArray(arr, i, j);
//            i++;
//            j--;
//        }
//        for(
//                int k = 0;
//                k<arr.length;k++)
//
//        {
//            System.out.print(" "+ arr[k]+" ");
//        }
//
//    }


//      public  static void main(String[] args){
//            int[] arr={1,4,6,7,9,10,89,78,55};
//            reverse_arr(arr);
//
//        }


        /* IDENTIFY THE LAST REPEATING ELEMENT IN AN ARRAY*/
//    static void repeating_elements(int[] arr){
//        int ans=0;
//        for(int i=arr.length;i>0;i--){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    ans=i;
//
//                    System.out.println(" last repeated number is  " + arr[i]+" At index  "+i);
//
//
//                }
//
//            }
//          if (ans>0){
//              break;
//           }
//
//
//
//
//
//        }
//
//
//
//    }
//
//    public static void main(String[] args){
//        int[] arr={1,5,3,4,6,3,4,6,7,8,9,7};
//        repeating_elements(arr);
//
//    }

        /*ROTATE AN ARRAY K TIMES*/  //  best question
//    static int[] rotate_arr(int[] arr, int k) {
//        int n = arr.length;
//        k = k % n;
//        int[] ans = new int[n];
//
//        int j = 0;
//        for (int i = n - k; i < n; i++) {
//            ans[j++] = arr[i];
//        }
//        for (int i = 0; i < n - k; i++) {
//            ans[j++] = arr[i];
//        }
//        return ans;
//
//
//    }
//    static void print_arr(int[] ans,int[] arr){
//        for(int i=0;i<ans.length;i++){
//
//
//
//            System.out.print(" "+ans[i]+" " );
//
//        }
//    }
//
//
//
//    public static void main(String[] args){
//    Scanner sc =new Scanner(System.in);
//        System.out.print("Enter The number to rotate the array : " );
//    int k= sc.nextInt();
//
//    int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
//
//
//
//
//        int[] ans=rotate_arr(arr ,k);
//        System.out.print("Array after rotation :  " );
//   print_arr(ans , ans );
        // }

        /* ROTATION OF THE ARRAY WITHOUT USING EXTRA SPACES*/   ///search on the google and do it again


        /* GIVEN THE Q QUERIES CHECK IF THE GIVE NUMBER IS PRESENT IN THE ARRAY OR NOT */

//    static void find(int[] arr,int x){
//        int find =-1;
//
//
//        for( int i=0;i<arr.length;i++){
//          if(arr[i]==x){
//              find=1;
//          }
//        }
//        if(find==1){
//            System.out.println("Number found in the array at the index  "  );
//        }
//        else{
//            System.out.println("Number not found in the array  "  );
//        }
//
//
//    }
//    public static void main(String[] args){
//        Scanner sc =new Scanner(System.in);
//        System.out.print("Enter the number you wont to find in the array : " );
//        int x=sc.nextInt();
//        int[] arr={1,2,3,4,5,6,7,7,89,65,78,9054,35};
//        find(arr ,x);
//    }
//

    }
