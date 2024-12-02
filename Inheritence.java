class calci{// this class is parent to both v2_calci and v3_calci
    public int add (int n1,int n2)
    {
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }

    public void display(){
        System.out.println("calci display");
    }
}

class v2_calci extends calci{//this class is child to calci and parent to V3_calci
    public double mult(int n1,int n2){//(this c;las  inherites the calci class methods)
        return  n1*n2;

    }
    public int dvd(int n1,int n2){
        return  n1/n2;

    }
    public void display(){
        System.out.println("v2_calci display");
    }

}

class v3_calci extends v2_calci{// this class is child to both calci and v2_calci(this will inherites both class methods)
    public int power(int n1,int n2)
    {
        return (int)Math.pow(n1,n2);
    }
}

public class Inheritence {
    public static void main(String srg[])
    {

        System.out.println(new calci().add(5,7));
        System.out.println(new calci().sub(5,7));
        System.out.println(new v2_calci().add(5,7));
        System.out.println(new v2_calci().sub(5,7));
        System.out.println(new v2_calci().mult(5,7));
        System.out.println(new v2_calci().dvd(5,7));
        System.out.println(new v3_calci().power(5,7));
        System.out.println(new v3_calci().add(5,7));
        System.out.println(new v3_calci().dvd(5,7));
        new v3_calci().display();
        
    }
        
    
}
