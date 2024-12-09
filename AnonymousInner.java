 abstract class AAA{
    abstract public void love();
    public void show(){
        System.out.println("inside AAA show");
    }
}


public class AnonymousInner {
    public static void main(String aggr[]){
        //Anonymous inner class for overriding
        AAA obj=new AAA(){
            public void show(){
                System.out.println("show in Anonymous inner class");
            }
            public void love(){
                System.out.println("love you to all");
            }
        };
        obj.show();
        obj.love();

        //if you want to do the abstraction (that is also posible with anonymous inner class)

        AAA obj1=new AAA(){
            public void love(){
                System.out.println("love you to all");
            }
        };
        obj.love();

    }
    
}
