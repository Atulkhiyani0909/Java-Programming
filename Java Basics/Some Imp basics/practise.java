import java.util.*;
public class practise {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            //do while loop best example with break;
           
      //      do {
      //       int n=sc.nextInt();
      //       System.out.println(n);
          
      //      if(n%10==0){
      //       break; /*if write continue here at place of break it will print all numbers accept multiple of 10;*/
      //      }
      // }
      //      while(true);


      //prime or not 
      //  System.out.println("Enter A num  to check it is  prime or not :: ");
      // int n=sc.nextInt();
     
      // boolean isprime =true;

      // for (int i=2;i<=Math.sqrt(n);i++){//we have written Math.sqrt(n) because after a desired time factors starts repeat itself.

      //       if(n%i==0){
      //             isprime =false;
      //       }
      // }
         
           
      //       if(isprime==true){
      //             System.out.println("Prime num");
      //       }
      //       else{
      //             System.out.println("Not prime");
      //       }

      //factorial of a number
//       System.out.println("Enter the number to find the factorial :: ");
//       int n= sc.nextInt();
//       int fact =1;
//       for(int i=1;i<=n;i++){
//             fact=fact*i;

//       }
//      System.out.println("The  factorial of "+ n +" is " + fact);


// PROBLEMS ON LOOP

//counting the number

// System.out.println("Enter the number to count :: ");
// int n=sc.nextInt();

// int count=0;
// while(n>0){
// n=n/10;
// count++;

// }
// System.out.println(count);


// SUM OF THE NUMBERS

// System.out.println("Enter the number :: ");
// int n =sc.nextInt();
// int sum=0;
// int counting;
// while(n>0){
     
//        counting= n%10;
//       sum=sum+counting;
//       n=n/10;

// }
// System.out.println(sum);


// SUM OF THE SPECIAL SERIES
// System.out.println("Enter the number :: ");
// int n =sc.nextInt();
// int ans =0;

// for(int i=1;i<=n;i++)
// {
      
//       if(i%2==0){
//              ans=ans-i;
//       }
//       else{
//             ans=ans+i;
//       }    
// }
// System.out.println("your answer is " + ans);

 //PRINT THE FACTORIAL OF THE ALL NUMBERS UPTO N

//  System.out.println("Enter Number :: ");
// int n= sc.nextInt();
// int fact =1;
// for(int i=1;i<=n;i++){
//       fact=fact*i;
//       System.out.println(i + " => Factorial is " +fact);
// }


//POWER RAISE TO THE NUMBER USING THE LOOP
System.out.println("Enter the number to print its power");
int a=sc.nextInt();
System.out.println("Enter the power of the number");
int b=sc.nextInt();
int pow=1;
int i=1;
while(i<=b){
      pow=pow*a;
      i++;
}
System.out.println("your answer is " + pow);


      }
}
