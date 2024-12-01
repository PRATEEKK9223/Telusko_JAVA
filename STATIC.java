public class STATIC {
    public static void main(String srg[]){

        Mobile obj=new Mobile();

        System.out.println(obj.price+":"+obj.grad+":"+obj.brand+":"+Mobile.type);
        obj.show();     //the non-static methos are access by object only
        //Mobile.show();  //we can not access by class name directly
        //obj.show2();    //we can not access static methods with the objects
        Mobile.show2(); //the static method are access by class name only

    }
}


class Mobile{

        int price;
        String brand;
        char grad;
        static String type;

        Mobile(){//it is constractor to initialize the objects(this block is executed first even before main metod)
            price=18000;
            brand="realme";
            grad='A';
            //type="smart phone";
            System.out.println("inside constractor");
        }

        static//it is used to initialize the static variables
        {
            type="smart phone";
            System.out.println("inside static block");
        }
        

    public void show(){
        System.out.println("inside show method");
    }

    public static void show2(){
        System.out.println("inside show-2 method");
    }
}
