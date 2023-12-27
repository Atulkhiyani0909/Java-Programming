public class GOGQuestion {
    public static void main(String[] args){
//       int[] arr={3,5,0,0,4};
//       int n=arr.length;
//        int i=0;
//        int j=arr.length-1;
//        while(i<j){
//            if(arr[i]==0 && arr[j]!=0){
//                int temp=arr[j];
//                arr[j]=arr[i];
//                arr[i]=temp;
//                i++;
//                j--;
//            }
//         else if(arr[i]==0 && arr[j]==0){
//             j--;
//            }
//         else if(arr[i]!=0 && arr[j]!=0){
//             i++;
//
//            }
//         else if(arr[i]!=0 && arr[j]==0){
//             i++;
//             j--;
//            }
//        }
//        for(int a=0;a<arr.length;a++){
//            System.out.print(" "+arr[a] );
//        }
//        int i=0;
//        for(int j=0;j<n;j++){//in this code if arr[j]==0 then the value of j will be increased but i will remain unchanged but when j!=0 the j incrases and i also increases
//            if(arr[j]!=0){
//                int temp=arr[j];
//                arr[j]=arr[i];
//                arr[i]=temp;
//                i++;
//            }
//        }
//        for(int a=0;a<n;a++){
//            System.out.print(" "+arr[a] );
//        }




//best code for max number of 1 in 2d array
        // code here
        int[][] arr={{0,9},{0,1,1,1},{1}};
        int count=0;
        int maxcount =0;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1){
                    count++;
                }

            }
            if(maxcount<count){
                maxcount=count;
                index=i;

            }
            count =0;
        }
        System.out.println(index);

//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                System.out.print(" "+arr[i][j] );
//            }
//            System.out.println( );
//        }


    }
}

//User function Template for Java

//class Solution {
//    void pushZerosToEnd(int[] arr, int n) {
//        // code here
//        int i=0;
//        int j=n-1;
//        while(i<j){
//            if(arr[i]==0 && arr[j]!=0){
//                int temp=arr[j];
//                arr[j]=arr[i];
//                arr[i]=temp;
//                i++;
//                j--;
//            }
//            else if(arr[i]==0 && arr[j]==0){
//                j--;
//            }
//            else if(arr[i]!=0 && arr[j]!=0){
//                i++;
//
//            }
//            else if(arr[i]!=0 && arr[j]==0){
//                i++;
//                j--;
//            }
//
//
//        }
//
//    }
//
//}