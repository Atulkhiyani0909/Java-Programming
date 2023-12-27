//import java.util.Scanner;
public class twopointers {
    /*SORTING ARRAY IN THE INCREASING  AND DECREASING ORDER WITHOUT USING SORT METHOD*/
//    static void sorting1(int[] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//
//                }
//
//
//            }
//
//        }
//        System.out.println( );
//        System.out.println("Sorted array ");
//        for (int j : arr) {//this to print array enhanced for loop
//            System.out.print(" " + j + " ");
//
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 3, 90,2, 89, 67, 467, 5, 7, 9, 10, 6, 23};
//        System.out.println("Original array ");
//        for (int j : arr) {//this to print array enhanced for loop
//            System.out.print(" " + j + " ");
//        }
//        sorting1(arr);


        /*SORTING ARRAY Even integer at the start and odd at the end*/
//    static void even_odd(int[] arr) {
//        System.out.println("array before sorting " );
//        for(int k=0;k<arr.length;k++){
//            System.out.print(" "+arr[k]+" " );
//        }
//
//        int n = arr.length;
//        int j = n - 1;
//        int i=0;
//        while(i<j){
//            if(arr[i]%2 ==1 && arr[j]%2==0){
//                int temp=arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//                i++;
//                j--;
//            }
//            if(arr[i]%2==0){
//                i++;
//            }
//            if(arr[j]%2!=0){
//                j--;
//            }
//
//
//        }
//        System.out.println( );
//        System.out.println("array after sorting " );
//
//        for(int k=0;k<arr.length;k++){
//            System.out.print(" "+arr[k]+" " );
//        }
//
//    }
//public static void main(String[] args){
//   // Scanner sc =new Scanner(System.in);
//    int[] arr={1,3,4,5,6,8,9,12};
//even_odd(arr);
//
//}


        /*SQUARE OF THE ALL ELEMENTS OF THE ARRAY AND ARRANGE THEM IN ASENDING ORDER*/
static int[] squaring(int[] arr){
    int n=arr.length;
    for(int i=0;i<n;i++){
        arr[i]=arr[i]*arr[i];
    }
//    for(int i=0;i<n;i++){
//        System.out.print(" "+arr[i]+" " );
//    }
    return arr;
}
static int[] increasing_decreasing(int[] arr){
    int n=arr.length;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
//        System.out.println( );
        System.out.print(" "+arr[i]+" " );
    }
return arr;
}
public static void main(String[] args){
    int[] arr={1,2,3,4,5,6,10,7,12,13,-8,-15};
    System.out.println(" Sorted Array " );

    squaring(arr);
    increasing_decreasing(arr);
}


    }
