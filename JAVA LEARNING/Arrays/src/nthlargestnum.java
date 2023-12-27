

public class nthlargestnum {
    /*PROGRAM TO FIND THE NTH LARGEST FROM THE ARRAY*/
    /*second way is that when we found the 1st max num make it value equals t0 -infinity and then again run the program*/
    public static void main(String[] args) {
        int[] arr={7,7,7,7,7,7,7,78,8,6,43};
        int num=0;
        int max;

        for(int i=0;i<arr.length;i++){
            if(num < arr[i]){
                num=arr[i];
            }

        }
        max=num;
        System.out.println("1st maximum is "+ max);
        int num1=0;
        int max2;
        for(int i=1;i<arr.length;i++){
            if(num1 < arr[i] && arr[i] !=max){
                num1=arr[i];
            }
        }
        max2=num1;
        System.out.println("2nd maximum number is " + max2);


        int num2=Integer.MIN_VALUE;
        int max3;
        for(int i=1;i<arr.length;i++){
            if(num2 < arr[i] && arr[i] !=max2 && arr[i] !=max){
                num2=arr[i];
            }
        }
        max3=num2;
        System.out.println("3rd maximum number is " + max3);


        int num3=0;
        int max4;
        for(int i=1;i<arr.length;i++){
            if(num3 < arr[i] && arr[i] !=max3 && arr[i] !=max2 && arr[i] != max){
                num3=arr[i];
            }
        }
        max4=num3;
        System.out.println("4th maximum number is " + max4);


/*this are min and max value for an integer in  java*/
        System.out.println(Integer.MIN_VALUE );
        System.out.println(Integer.MAX_VALUE );


    }
}