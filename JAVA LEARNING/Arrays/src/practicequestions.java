import java.util.Scanner;
public class practicequestions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array =>  ");
        n = sc.nextInt( );
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element no. " + (i + 1));
            arr[i] = sc.nextInt( );
        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int swap = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = swap;
//                }
//
//            }
//
//        }
//        System.out.println("Sorted array is => " );
//for(int i=0;i<arr.length;i++){
//    System.out.print(" "+ arr[i]+" " );
//}

//        System.out.println("Enter the number to search in an array " );
//        int search=sc.nextInt();
//        boolean searching =false;
//        int i=0;
//        for( i=0;i<arr.length;i++){
//            if(search==arr[i]){
//
//                searching =true;
//                break;
//            }
//
//
//        }
//        if(searching==true){
//            System.out.println("Element founded at index "+ i );
//        }
//        else{
//            System.out.println("No such element " );
//        }

//PROGRAM TO PRINT ANY ONE NUMBER MISSING IN AN ARRAY
        System.out.println("Enter any number " );
        int f=sc.nextInt();
        int sum =0;
        for(int i=1;i<=f;i++){
            sum=sum+i;
        }
        int sum1=0;
        for(int i=0;i<arr.length;i++){
             sum1 =sum1 + arr[i];
        }
        int missing_number =sum-sum1;
        System.out.println("The missing number is " + missing_number );
    }

}
