public class conditionalstate {
      public static void main(String[] args) {
            /* conditional statements
             if,else
             else if
             ternary operator
             switch statement
            */

             int a=70;
            int b=90;

            //if else
           

             if(a>b){
                  System.out.println("A is greater");
            }
            else{
                  System.out.println("B is greater");
            }

            

            // else if
            if(a>b){
                  System.out.println("A is greater");
            }
            else if(a>50){
                  System.out.println("A is greater than 50 ");
            }
            else{
                  System.out.println("B is greater");
            }   


            /*ternary operator 3 operands
            by this we can write if else in one line */


            //variable =condition?statement1(if true):statement2(if false);

            String type =(6%2==0)?"even":"odd";
            System.out.println(type);



            /*Switch Statement */
            String food="mango";
            switch(food){
                  case "samosa":System.out.println("samosa");
                  break;
                  case "mango":System.out.println("Mango shake");
                  break;
                  case "burger":System.out.println("burger");
                  break;
                  default:System.out.println("Wake up");
            }
              




      }
      
}
