class Outer{
    int var=100;

    public void config(){
        System.out.println("congig(outer)");
    }

    class inner{
        void show(){
            System.out.println("in inner");
        }
        static void show2(){
            System.out.println("inside show2 (inner)");
        }

    }
}
public class InnerClass {
    public static void main(String[] arg){

        //object for outer class
        Outer obj=new Outer();
        obj.config();

        //object for inner
        Outer.inner obj2 =obj.new inner();
        obj2.show();
        //obj2.show2();
        //if the method is static 
        Outer.inner.show2();
    }
    
}
