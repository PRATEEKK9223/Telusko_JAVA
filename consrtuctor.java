 class car{
    int price;
    String name;
    String origin;
    //(constructor is exicuted only when object is created)

    public car(int price,String name )//this parameterized constructor
    {
        System.out.println("object is created(1st constructor)");
        this.price=price;
        this.name=name;
    }
    public car()//this is default constructor
    {
        System.out.println("object is created (2nd constructor)");
        origin ="India";
    }

}




public class consrtuctor {
    public static void main(String arg[])
    {
        car obj1=new car(15000,"THAR");
        System.out.println(obj1.price+" "+obj1.name+" "+ obj1.origin);

        car obj2 = new car();
        System.out.println(obj2.price+" "+obj2.name+" "+obj2.origin);

    }
}


