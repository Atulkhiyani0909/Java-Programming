public class constructor {
      int a;
      int b;
      constructor(int x,int y){//this is the constructor it name should be same as the  class name .
            System.out.println("called it");
            a=x;
            b=y;

      }
      int add(){
            return a+b;
      }
       int sub(){
            return a-b;
      }
       int multi(){
            return a*b;
      }
      public static void main(String[] args) {
            constructor obj1=new constructor(5,7);  
            System.out.println(obj1.add()); 
             System.out.println(obj1.multi());  
              System.out.println(obj1.sub()); 
              
              constructor obj2=new constructor(10, 7);
              System.out.println(obj2.add()); 
             System.out.println(obj2.multi());  
              System.out.println(obj2.sub()); 


              constructor obj3=new constructor(90, 89);
              System.out.println(obj3.add()); 
             System.out.println(obj3.multi());  
            System.out.println(obj3.sub());

      }
}
