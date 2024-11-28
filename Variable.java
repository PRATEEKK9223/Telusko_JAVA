public class Variable {
    public static void main(String arg[]){
        //premitive datatypes in java
        //Integers
        int num1=100;//4bytes
        short sh=193;//2bytes
        byte by=127; // rage : -128 to 127 //1 byte
        long ln=18377; // (8 bytes)you must specify the long with (l)at end of the number
        
        //floting numbers
        double d=23.67;//(8 bytes) // in java the real number is in double by default
        float fl=45.48f;//(4 bytes) when storing the real in floar you must specifies the (f)at end of number

        //charactes
        char sec='b';//(2 byte)the character mst be in single quotes

        //boolean
        boolean ispresent=true;//(1 byte)it stores only two values either true or false

        //literales

        int leteral=0b101;
        int crore=10_00_00_000;

        System.out.println(num1);
        System.out.println(sh);
        System.out.println(by);
        System.out.println(ln);
        System.out.println(d);
        System.out.println(fl);
        System.out.println(sec);
        System.out.println(ispresent);

        System.out.println(leteral);
        System.out.println(crore);
    }
    
}
