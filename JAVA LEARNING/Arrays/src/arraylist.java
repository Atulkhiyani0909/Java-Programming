
import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
    public static void main(String[] args){

        Integer a= Integer.valueOf(5);
        System.out.println(a );
        Float f= Float.valueOf(78.95f);
        System.out.println(f );
        ArrayList<Integer> l1=new ArrayList<>(  );
        ArrayList<Boolean> l2=new ArrayList<>(  );// in this size of the array os not fixed
        // adding new element in the array list
        l1.add(45);
        l1.add(678);
        l1.add(78);
        l1.add(451);
        l1.add(6178);
        l1.add(788);

        System.out.println(l1.get(0));
        for(int c=0;c<l1.size();c++){
            System.out.print(" "+l1.get(c) );
        }
        l1.add(1 , 100);
        l1.set(2, 200);// for changing the element at the index 1 ;
        l1.remove(1);//for deleting any index from the arraylist ;
       l1.remove(Integer.valueOf(200));//for removing any elemnt without it index ;
        System.out.println( );
        System.out.println(l1 );// by this also  we can print array list in square bracket [ ];
        //in an arraylist if cant difine its type we can give any value to it string,boolean,intger etc to it ;


        // for more visit( "  https://www.geeksforgeeks.org/arraylist-in-java/ " ) arraylist ;


        // program to reverse an arraylist

        ArrayList<Integer> f1=new ArrayList<>();
       f1.add(4);
       f1.add(78);
        f1.add(42);
        f1.add(718);
        f1.add(46);
        f1.add(7908);
        System.out.println( );
        System.out.println("Original arraylist " );
        System.out.println(f1 );
//        int i=0;
//        int j=f1.size()-1;
//        while(i<j){
//           Integer temp=Integer.valueOf(f1.get(i));
//           f1.set(i,f1.get(j));
//           f1.set(j,temp);
//
//         i++;
//         j--;
//
//        }
        Collections.reverse(f1);// inbulit function
        System.out.println("reverse " + f1);
        Collections.sort(f1);
        System.out.println(f1 );
//        System.out.println("Reversed arraylist " );
//        System.out.println(f1 );


        ArrayList<String> s1 =new ArrayList<>(  );
        s1.add(" Atul ");
       s1.add(" khiyani  ");

        System.out.println(" Original " + s1 );
        Collections.reverse(s1);
        System.out.println( "Reversed " + s1);

        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1 );// in decending order;




    }
}
