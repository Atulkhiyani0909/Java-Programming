import java.util.Scanner;
public class array2Dproblem {
    static void print_array(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(" "+arr[i][j] );
            }
            System.out.println( );
        }
    }
    static int[][] transpose_matrix(int[][]arr,int r,int c){
        int[][] ans=new int[c][r];//because number of colums is equals to new matrix number of rows
     for(int i=0;i<c;i++){
         for(int j=0;j<r;j++){
             ans[i][j]=arr[j][i];
         }
         System.out.println( );
     }
     return ans;



    }
//    static void transpose_no_extra_space(int[][] arr,int r,int c){
//
//        for(int i=0;i<c;i++){
//            for(int j=i;j<r;j++){
//                int temp=arr[i][j];
//                arr[i][j]=arr[j][i];
//                arr[j][i]=temp;
//            }
//        }
//    }
    static void reverseArray(int[] ans){
       int i=0 , j=ans.length-1;
       while(i<j){
           int temp=ans[i];
           ans[i]=ans[j];
           ans[j]=temp;
           i++;
           j--;
       }
    }

    static void rotate(int[][] ans,int n){
    transpose_matrix(ans ,n,n);
    for(int i=0;i<n;i++){
   reverseArray(ans[i]);
}

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //jacked array where we didnot specify the number of colums in 2d array
        //int[][]=new int[5][]; this second bracket is empty as we did'nt want the fix number of array in all the rows
        //this above explanation is about   JACKED ARRAY -this is used in an 2d array


        /* Q1 find the transpose of the matrix */

//        System.out.println("Enter the number of rows of the matrix " );
//        int r=sc.nextInt();
//        System.out.println("Enter the number of column of the matrix " );
//        int c= sc.nextInt( );
//        int[][] arr= new int[r][c];
//        System.out.println("Enter the elements of the matrix " );
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                arr[i][j]=sc.nextInt();
//            }
//            System.out.println( );
//        }
//
//        System.out.println("Input matrix " );
//        print_array(arr);
//    //     transpose_matrix();
//        System.out.println("Transpose matrix is " );
//        int[][] ans=transpose_matrix(arr,r,c);
//        print_array(ans);

      //  transpose_no_extra_space(arr,r,c);




       /* Q2 rotate a square matrix 90 degree in clockwise direction without any extra space */

        /* find the transpose of the matrix and than reverse its rows it will convert to the 90 degree rotated matrix */

        System.out.println("Enter the dimension  of the matrix " );
        int n=sc.nextInt();

        int[][] arr1= new int[n][n];
        System.out.println("Enter the elements of the matrix " );
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=sc.nextInt();
            }
            System.out.println( );
        }
        System.out.println("Input matrix " );
       print_array(arr1);

        rotate(arr1,n);
        System.out.println("rotated matrix " );
        print_array(arr1);










    }

}