//type conversion:- implisity(auomatiacally) convert the one datatype to anoter datatype  called type conversion
//EX:- byte-int,int-float,int-long
//type casting:- explisity(forcefully) conver the one datatype to another datatype called type casting
//EX:- int-byte,float-int,double-int,


public class Tyep_conversion_casting{
    public static void main(String arg[]){
        //type conversion
        byte a=100;
        int b=a;
        System.out.println(b);
        //type casting
        int a1=167;
        byte b1=(byte)a1; //here byte range -128to127 so it modulus that answer then stored to int
        //b1=a1%256; after also it give more value then do this 167-256=b1;
        System.out.println(b1);
        float fl=16.7f;
        int i=(int)fl;//type casting
        float f2=i;//type conversion
        System.out.println(i);
        System.out.println(f2);
    }
}