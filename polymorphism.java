class cal{
    //method overloading
    public int add(int n1,int n2){
        return n1+n2;
    }
    public double add(double n1,double n2){
        return n1+n2;
    }

    //Example for method Overriding
    public void show(){
        System.out.println("in cal");
    }
}

class v1_cal extends cal{
    //method Overriding
    public void show(){
        System.out.println("in V1_cal");
    }
}

class v2_cal extends cal{
    public void show(){
        System.out.println("in v2_cal");
    } 
}


public class polymorphism{
    public static void main(String arg[]){
        v1_cal obj=new v1_cal();
        //method Overriding
        obj.show();
        //method overloading
        int result=obj.add(1,4);
        System.out.println(result);
        double result1=obj.add(4.5,5.5);
        System.out.println(result1);

        //(super class refrence) dynamic method dispath(metod overriding)
        //here we created super class refrence and using that we created the objects for both the subclasses

        cal obj1=new v1_cal();
        obj1.show();
        cal obj2=new v2_cal();
        obj2.show();
        


    }
}