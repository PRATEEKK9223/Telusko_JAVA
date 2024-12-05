class place{

    String dirstic="Shimogga";
    int PIN=5774423;
    public void name(){
        System.out.println("Kumsi");
    }
}


class place2{
    String dirstic="Shimogga";
    int PIN=5774423;
    public void name(){
        System.out.println("Kumsi");
    }

}



public class somthing {
    public static void main(String arg[]){
        place obj1 =new place();
        place2 obj2=new place2();
       
        System.out.println( obj1.PIN);

        System.out.println(obj1);
        System.out.println(obj1.toString());
        System.out.println(obj2);
        System.out.println(obj2.toString());

        System.out.println(obj1.getClass());
        System.out.println(obj1.hashCode()==obj2.hashCode());

        System.out.println(obj1.equals(obj2));
    }
    
}
