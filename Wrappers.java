public class Wrappers {
    int num=10;
    Integer num1=new Integer(num);//boxing
    Integer num2=num; //Auto-boxing

    //Auto-unboxing(fetching the premitive data from object type )
    int res=num2;

    public void show(){
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(res);

    }

    public static void main(String[] args){
        Wrappers obj =new Wrappers();
        System.out.println();
        obj.show();
    }
    
}


