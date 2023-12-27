import java.util.Scanner;
public class goodquestion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of house in front of your house " );
        int n=sc.nextInt();
        System.out.println("Enter the size of your mansion equals to " );
        int w= sc.nextInt( );
        int[] arr=new int[n];
  if(w>n){
    System.out.println("Wrong input  mansion size can not be greater than  no. of houses" );

  }
  else {
      int sum = 0;
      //int[] ans=new int[w];
      for (int i = 0; i < n; i++) {
          System.out.println("Enter the number of people leave in the house " + (i + 1));
          arr[i] = sc.nextInt( );
      }

      int max_people = 0;
      for (int i = 0; i <= (n - w); i++)//best line of the code
      {
          int temp = 0;
          for (int j = 0; j < w; j++)//best line of the code
          {
              temp = temp + arr[i + j];//best line of the code to add sum
          }

          if (temp > max_people) {
              max_people = temp;
          }
      }
      System.out.println("The max number of people  across your mansion are " + max_people);
  }
    }
}

