class calculater{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public double add(double n1,int n2,int n3){
        return n1+n2+n3;
    }
    public void add(short n1,int n2,long n3){
        long result;
        result=n1+n2+n3;
        System.out.println(result);
    }
}



public class methodOverloading {
    public static void main(String arg[]){

        calculater calci=new calculater();
        int result=calci.add(1,3);
        double result2=calci.add(5.6,3,7);
        int result3=calci.add(2,3,4);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
    
}
