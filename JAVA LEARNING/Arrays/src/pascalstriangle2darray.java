import java.util.Scanner;
public class pascalstriangle2darray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //jacked 2d array is used
        System.out.println("Enter n " );
        int n= sc.nextInt( );

        int[][] ans =new int[n][];
        for(int i=0;i<n;i++) {

            ans[i] = new int[i + 1];//manually declearing the size of 1d array . this is the jacked array
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++) {// j is starting from 1 upto
                // i because we have already filled the 0 and i+1 value of the j as 1;
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];



            }

        }
        System.out.println("Pascals triangle is " );
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" "+ans[i][j] );
            }
            System.out.println( );
        }
    }
}
