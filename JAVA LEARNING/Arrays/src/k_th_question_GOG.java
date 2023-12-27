import java.util.Scanner;
public class k_th_question_GOG {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr ={1,23,12,9,3,2,50,4};

        // kth rotation
//        System.out.println("Enter the value of the kth rotation " );
//        int n=sc.nextInt();
//        int j=6;
//        while(n<j){
//            int temp=arr[j];
//            arr[j]=arr[n];
//           arr[n]=temp;
//            n++;
//            j--;
//        }
//        System.out.println(" Array after the kth rotaion " );
//        for(int i=0;i<arr.length;i++){
//            System.out.print(" "+ arr[i] );
//        }

        //kth smallest element

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[j];
            arr[j]=arr[i];
           arr[i]=temp;

                }

            }
        }
        System.out.println("Enter the value of the kth smallest " );
int k= sc.nextInt( );

    int[] a = new int[k];
    int l = 0;
    for (int b = 0; b < k; b++) {
        a[l] = arr[b];
        l++;


}
        for(int i=0;i<a.length;i++){
            System.out.println(a[i] );
        }
//        System.out.println(k+" Largest element is "+arr[k-1] );
    }

}
