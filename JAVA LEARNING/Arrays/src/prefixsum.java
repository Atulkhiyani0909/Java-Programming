import java.util.Scanner;
public class prefixsum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //int arr[] = {1, 2, 3, 4, 5,6,7,8,9,10};

        //SUM  PREFIX SUM OF THE ELEMENTS
//        for (int i = 1; i < arr.length; i++) {
//            arr[i] = arr[i] + arr[i - 1];
//        }
//        System.out.println("array after prefix sum is ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(" " + arr[i] + " ");
//        }

        // THE VALUES OF  1 AND R IN QUERIES FOLLOW 1 BASED INDEXING good apporach
//        System.out.println(" Enter the size of the array " );
//        int n=sc.nextInt();
//        int arr[] =new int[n+1];//1 based indexing
//        for(int i=1;i<=n;i++){//this is used for the 1 based indexing of an array
//            System.out.println("Enter the element "+ i );
//            arr[i]=sc.nextInt();
//        }
//        for (int i = 1; i < arr.length; i++) {
//            arr[i] = arr[i] + arr[i - 1];
//        }
////        System.out.println("Sorted array is " );
////        for(int i=1;i<arr.length;i++){
////            System.out.print(" "+ arr[i] +" ");
////        }
//        System.out.println( );
//        System.out.println("Enter the start of the series number " );
//        int l =sc.nextInt();
//        System.out.println("Enter the end number of the series " );
//        int r=sc.nextInt();
//
//        int sum =arr[r]-arr[l-1];//this for the prefix sum of the give q number of the queries
//
//        System.out.println("The answer of the above algo is " + sum );


        //  CHECK WE CAN PART A ARRAY INTO ARRAY SO THAT BOTH HAVE THE SAME SUM
        // WE HAVE TO DO BOTH SUFFIX AND PREFIX SUM IN  THIS QUESTION
//        System.out.println("Enter the size of the array " );
//        int n= sc.nextInt( );
//        int arr[] =new int[n+1];
//        for(int i=1;i<=n;i++){
//            System.out.println("Enter the element "+ i );
//            arr[i]=sc.nextInt();
//        }
//        int prefix =0;
//        for(int i=0;i<arr.length;i++){
//            prefix+=arr[i];
//            int suffix =10-prefix ;
//            if(suffix == prefix ){//suffix sum array best code without calculating it
//                System.out.println(true );
//            }
//            else {
//                System.out.println(false );
//            }
//        }





    }
}