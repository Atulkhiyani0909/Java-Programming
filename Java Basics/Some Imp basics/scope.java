public class scope {

      static void changevalue(int a ){
            a*=100;
            System.out.println("After changing value "+ a);

      }
      public static void main(String[] args) {
            /*Global scope */
            /*
             * Class level scope
             * method level scope
             * same as {
             * global scope 
             * local scope
             * }
             *{
                  int b=10;
             }
             sout(b)//this will not executed because it is out of the block but b is in the bloack level block
             *loop variables also have block level scope
             *
             */
            int a=10;
            System.out.println("Before changing value " + a);
            changevalue(a);

            

      }
}
