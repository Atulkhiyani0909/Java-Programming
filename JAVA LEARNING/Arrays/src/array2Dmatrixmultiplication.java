import java.util.Scanner;
public class array2Dmatrixmultiplication {
    static void multiplymatrix(int[][] a,int[][] b,int r1,int c1,int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication cannot be possible wrong dimension ");
        } else {
            int[][] mul = new int[r1][c2];
            for (int i = 0; i < r1; i++) {//row number
                for (int j = 0; j < c2; j++) {//column number
                    for (int k = 0; k < c1; k++) {
                        mul[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("Multiplication of 2 matrix is ");
            for (int i = 0; i < mul.length; i++) {
                for (int j = 0; j < mul[i].length; j++) {
                    System.out.print(" " + mul[i][j]);
                }
                System.out.println( );
            }

        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        // matrix 1
        System.out.println("Enter the rows of the matrix 1 " );
        int r1=sc.nextInt();
        System.out.println("Enter the columns in the matrix 1 " );
        int c1=sc.nextInt();

        int[][] a=new int[r1][c1];
        System.out.println("Enter the elements of the matrix " );
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
            System.out.println( );
        }
//        System.out.println("Your input matrix is " );
//        for(int i=0;i<r1;i++){
//            for(int j=0;j<c1;j++){
//                System.out.print(" "+a[i][j] );
//            }
//            System.out.println( );
//        }
        // matrix 2

        System.out.println("Enter the rows of the matrix 2 " );
        int r2=sc.nextInt();
        System.out.println("Enter the columns in the matrix 2  " );
        int c2=sc.nextInt();

        int[][] b=new int[r2][c2];
        System.out.println("Enter the elements of the matrix " );
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                b[i][j]=sc.nextInt();
            }
            System.out.println( );
        }
//        System.out.println("Your input matrix is " );
//        for(int i=0;i<r1;i++){
//            for(int j=0;j<c1;j++){
//                System.out.print(" "+b[i][j] );
//            }
//            System.out.println( );
//        }
        multiplymatrix(a,b,r1,c1,r2,c2);





    }

}
