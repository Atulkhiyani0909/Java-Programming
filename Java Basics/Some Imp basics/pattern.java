import java.util.Scanner;

public class pattern {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
           
            //pattern 1 
            //int n=sc.nextInt();
            //int i=1;
            // while(i<=n){
            //       int j=1;
            //       while(j<=n){
            //             System.out.print("*");
            //             j++;
            //       }
            //       System.out.println();
            //       i++;
            // }

            //patter 2
            // System.out.println("Enter Number : ");
            // int n =sc.nextInt();
            //int i=1;
            // while(i<=n){
                
            //       int j=1;
            //       while(j<=i){
            //             System.out.print(" ATUL ");
            //             j++;
            //       }
            //       System.out.println();
            //       i++;
            // }

            //pattern 3
            // System.out.println("Enter the number :: ");
            // int n= sc.nextInt();
            // int i=n;
            // while(i>0){
            //       int j=1;
            //       while(j<=i){
                        
            //             System.out.print("*");
            //             j++;
            //       }
            //       System.out.println();
            //       i--;
            // }
     

            //pattern 4
            //  System.out.println("Enter the number :: ");
            // int n= sc.nextInt();
            // int i=1;
            // while(i<=n){
            //       int j=1;
            //       while(j<=i){
                        
            //             System.out.print(j+ " ");
            //             j++;
            //       }
            //       System.out.println();
            //       i++;
            // }

            //pattern 5
            //  System.out.println("Enter the number :: ");
            // int n= sc.nextInt();
            // int i=1;
            // char ch ='A';
            // while(i<=n){
            //       int j=1;
                  
            //       while(j<=i){
            //             System.out.print(ch+" ");
            //             ch++;
            //             j++;
            //       }
                  
            //       System.out.println();
                
            //       i++;
            // }

            //pattern 6
            //   System.out.println("Enter the number :: ");
            // int n= sc.nextInt();
            // int i=1;
            // char ch ='A';
            // while(i<=n){
            //       int j=1;
                  
            //       while(j<=n){
            //             System.out.print(ch+" ");
            //             ch++;
            //             j++;
            //       }
                  
            //       System.out.println();
                
            //       i++;
            // }


            //pattern 7 best pattern hollow
            // System.out.println("Enter the Number");
            // int n=sc.nextInt();
            // int i=1;
            // for(i=1;i<=n;i++){
                
            //       for(int j=1;j<=n;j++){
            //             if(i==1  || i==n || j==1 || j==n){
            //                   System.out.print("*");


            //             }else{
            //                   System.out.print(" ");
            //             }

            //       }
            //       System.out.println();
                  
            // }
            /* Explanation of the above pattern it means that when i=1 or i=n or j=1 or j=n we have to print the star and else we have to print the space  j is the horizontal line so when j=1 or j=n  it will print * in start and in end and i is the vertical so when i=1 or i=n it will print star */


            //PATTERN 8 hollow

            //  System.out.println("Enter the Number");
            // int n=sc.nextInt();
            // int i=1;
            // for(i=1;i<=n;i++){
                
            //       for(int j=1;j<=i;j++){
            //             if(i==1  || i==n || j==1 || j==i){
            //                   System.out.print("*");


            //             }else{
            //                   System.out.print(" ");
            //             }

            //       }
            //       System.out.println();
                  
            // }


            //PATTERN 9 triangular space

            //  System.out.println("Enter the Number");
            // int n=sc.nextInt();
            // int i=1;
            // while(i<=n){
            //      int space=1;
            //             while(space<=n-i){
            //                   System.out.print(" ");
            //                   space++;
            //             }
            //       for(int j=1;j<=i;j++){
                       
            //             System.out.print("*");

            //       }
            //       i++;
            //       System.out.println();
                  
            // }

            //PATTERN 10 PYRAMID

            // int n= sc.nextInt();
            
            // for(int i=1;i<=n;i++){
            //     for(int k=1;k<=n-i;k++){//space => k<=n-i
            //       System.out.print(" ");
            //     }
                  
            //     for(int j=1;j<=2*i-1;j++){
            //             System.out.print("*");
                       
            //       }
            //       System.out.println();
            // }

            //PATTERN 11 RECTANGULAR NUMERICAL 
            
      //       int n=sc.nextInt();
      //       for(int i=1;i<=n;i++){
      //       int j=1;
      //             for( j=i;j<=n;j++){
      //                   System.out.print(" "+ j +" ");//or j
      //             }
                 
            
            
      //       for(int k=1;k<=i-1;k++){
      //             System.out.print(" "+ k +" ");//or k
      //       }//practise this type more
      //       System.out.println();
      // }


      //PATTERN 12 SPECIAL
//hint solve as matrix type column and rows pattern
// System.out.println("Enter the number :: ");
//       int n=sc.nextInt();
//       for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++ ){

            
//             if((i+j)%2==0){
//                   System.out.print(1);
//             }
//             else{
//                   System.out.print(2);
//             }
//       }
//       System.out.println();
//       }
      
      }
}
     