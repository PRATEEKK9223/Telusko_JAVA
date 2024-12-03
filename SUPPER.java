// in java Each Constructor having one method called super() this will calls the constructor of parent class(this is default method no need to explisity add )
//this() fuction is mention exiplisitly to call itself construction 

import first.*;
//import first.Truck;

class A extends Object //every class extends this Object class defaultly
{
    public A(){
        super();
        System.out.println("in A");
    }

    public A(int A){
        super();
        System.out.println("in A int");

    }
}

class B extends A
{
    public B(){
        super(2);
        System.out.println("in B");
    }
    public B(int n){
        super(2);
        System.out.println("in B int");
    }
}



public class SUPPER 
{
    public static void main(String[] arg){
        B obj =new B(3);
        B obj2 =new B();

        Truck obj3=new Truck();
        obj3.name();
        obj3.name2();

        

    }
}
