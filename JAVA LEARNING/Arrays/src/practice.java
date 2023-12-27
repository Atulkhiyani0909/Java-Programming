import java.util.Arrays;
public class practice {
    public static void main(String args[]) {
        //array should be sorted
//       int[] arr={2,5,1,0,-1,90,89,6,9,-18};
//       Arrays.sort(arr);
//       for(int i=0;i<arr.length;i++){
//           System.out.println(arr[i] );
//       }
//       int n=arr.length;
//       int y=0;
//       boolean ans= false;
//       for(int i=0;i<n-1;i++){
//           int j=i+1;
//           int k=n-1;
//           int x=arr[i];
//           while(j<k){
//               if(x+arr[j]+arr[k]==y){
//                   i++;
//                   k--;
//                   ans=true;
//                   break;
//               }
//               else if(x+arr[j]+arr[k]<y){
//                   j++;
//               }
//               else{
//                   k--;
//               }
//           }
//       }
//        System.out.println(ans);
//        int n=6;
//        int ans=0;
//        int y=13;
//        int[] arr={1 ,4 ,45, 6, 10, 8};
//        for(int i=0;i<n-1;i++){
//            for(int j=i+1;j<arr.length;j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
//
//        for(int i=0;i<n-1;i++){
//            int j=i+1;
//            int k=n-1;
//
//
//            int x=arr[i];
//            while(j<k){
//                if(x+arr[j]+arr[k]==y){
//
//                   i++;
//                   k--;
//
//                   ans=1;
//                   break;
//               }
//               else if(x+arr[j]+arr[k]<y){
//                   j++;
//               }
//               else{
//                   k--;
//               }
//           }
//       }
//        System.out.println(ans);

//        int[] arr={1,2,3,7,5};
//        int x=12;
//        for(int i=1;i<arr.length;i++){
//            arr[i]=arr[i]+arr[i-1];
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i] );
//        }
//        for(int i=1;i<arr.length;i++){
//            int j=-1;
//            if(x==arr[i]-arr[j]){
//
//                i++;
//                j--;
//                break;
//            }
//        }

        int[] arr={-2,-1,0,1,1,1,5,6,7,8};

            int count=0;
            int n=arr.length;
            int k=6;
            int i=0;
            int j=n-1;
            while(i<n-1){

                if(arr[i]+arr[j]==k){
                    i++;
                    j--;
                    count++;
                }
                else if(arr[i]+arr[j]>k){
                    j--;

                }
                else{
                    i++;
                }
            }
        System.out.println(count );

        }

            }

