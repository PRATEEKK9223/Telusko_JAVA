interface computer{
    void code(); // here methods are public and abstract (defaultly)
    public abstract void run();//no need to explisitly add the public and abstracts
}
class Devloper{
    public void devapp(computer lap){
        lap.code();
    }
}

class laptop implements computer{
    public void code(){
        System.out.println("coding...");
    }

    public void run(){
        System.out.println("runing...");
    }
}
class deckstop implements computer{
    public void code(){
        System.out.println("coding...(faster)");
    }

    public void run(){
        System.out.println("runing...");
    }
}
    

public class InterDemo {
    public static void main(String[] arg)
    {
        //you can creat a refrence of interface but not object
        computer lap=new laptop();
        computer desk=new deckstop();

        Devloper prateek =new Devloper();
        prateek.devapp(desk);
    }
    
    
}
