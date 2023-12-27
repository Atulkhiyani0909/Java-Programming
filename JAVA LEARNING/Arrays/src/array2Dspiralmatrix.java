import java.util.Scanner;
public class array2Dspiralmatrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ///2D spiral matrix good question
//        System.out.println("Enter the dimension of the matrix " );
//        int n=sc.nextInt();
//        int c= sc.nextInt( );
//        System.out.println("Enter "+ n*c+ " elements of the matrix " );
//
//        int[][] arr=new int[n][c];
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<c;j++){
//               arr[i][j]=sc.nextInt();
//            }
//            System.out.println( );
//        }
//
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<c;j++){
//                System.out.print(" " + arr[i][j] );
//            }
//            System.out.println( );
//        }
//        int toprow=0;
//        int bottomrow=n-1;
//        int leftcol=0;
//        int rightcol=c-1;
//
//        System.out.println( );
//        System.out.println( );
//        System.out.println("Spiral 2-D array is " );
//        int a=0;
//        while(a<n*c){
//          //  toprow => rightcol => bottomrow => leftcol
//
//            //toprow
//for(int j=leftcol;j<=rightcol && a<n*c;j++){
//    System.out.print(arr[toprow][j]+" " );
//    a++;
//}
//toprow++;
//
//         //rightcol
//for(int i=toprow;i<=bottomrow && a<n*c;i++){
//    System.out.print( arr[i][rightcol] + " ");
//    a++;
//}
//rightcol--;
//
//         //bottomrow
//for(int j=rightcol;j>=leftcol && a<n*c;j--){
//    System.out.print(arr[bottomrow][j] +" ");
//    a++;
//}
//
//bottomrow--;
//
//        //leftcol
//for(int i=bottomrow;i>=toprow && a<n*c;i--){
//    System.out.print(arr[i][leftcol]+" " );
//    a++;
//}
//leftcol++;
//
//
//
//        }


        System.out.println("Enter the value of n" );
        int n= sc.nextInt( );
        int curr=1;


        int[][] arr=new int[n][n];
        int toprow=0;
        int bottomrow=n-1;
        int leftcol=0;
        int rightcol=n-1;

        System.out.println( );
        System.out.println( );
        System.out.println("Spiral 2-D array is " );
        int a=0;
        while(curr<=n*n){
          //  toprow => rightcol => bottomrow => leftcol

            //toprow
for(int j=leftcol;j<=rightcol && curr<=n*n;j++){
    arr[toprow][j]=curr;
    curr++;
}
toprow++;

         //rightcol
for(int i=toprow;i<=bottomrow && curr<=n*n ;i++){
    arr[i][rightcol]=curr;
    curr++;
}
rightcol--;

         //bottomrow
for(int j=rightcol;j>=leftcol && curr<=n*n;j--){
    arr[bottomrow][j]=curr;
    curr++;
}

bottomrow--;

        //leftcol
for(int i=bottomrow;i>=toprow && curr<=n*n;i--){
    arr[i][leftcol]= curr;
    curr++;
}
leftcol++;



        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] +" " );
            }
            System.out.println( );
        }

    }
}
