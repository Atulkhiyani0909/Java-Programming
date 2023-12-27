import java.util.Scanner;
public class arr3 {
    /* Q 2   Given the elements and find the 3 -3  pairs that sum == the num given in an aaray */
    static void arr_prob(int[] arr,int  n){


        int count=0;

        for ( int i = 0; i < arr.length; i++) {
            for( int j=i+1;j<arr.length;j++){
                {
                    for(int a=j+1;a<arr.length;a++){
                        if(arr[i]+arr[j]+arr[a]==n){
                            count++;

                        }
                    }

                }
            }


        }

        System.out.println("Total no. of pairs are " + count );
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : " );
        int k= sc.nextInt();
        int[] arr=new int[k];
        /*User input in array*/
        for(int i=0;i<k;i++){
            System.out.println("Enter Element  " + i );
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the num to find the pair of it : " );
        int n = sc.nextInt();

        //int[] arr={4,6,3,5,8,2};
        arr_prob(arr , n );










    }

}
