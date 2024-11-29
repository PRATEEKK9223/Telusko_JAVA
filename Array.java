
class Default{
    int a[]=new int[5]; //declaration with initialization wit 0 values
    {
        a[0]=10; 
        a[1]=20;
        a[2]=30;
        //a[3]=30;
        //a[4]=30;
    }

    public void Ex(){
        int arry[]={10,20,30};

        for(int i=0;i<arry.length;i++)
            System.out.println(arry[i]+" ");
    }

    public void Ex2()
    {
        int arry[]=new int[5];
        for(int i=0;i<arry.length;i++)
        {
            arry[i]=(int)(Math.random()*100);
        }

        for(int i:arry)
        {
            System.out.printf("%d ",i);
        }
    }
    
}


public class Array {
    public static void main(String arg[]){
       // int a[]=new int[5]; //int a[]={10,20,30};
        
       // System.out.println(a[0]);
       // System.out.println(a[1]);
       // System.out.println(a[2]);
       Default obj = new Default();

        System.out.println(obj.a[0]);
        System.out.println(obj.a[1]);
        System.out.println(obj.a[2]);
        System.out.println(obj.a[3]);
        System.out.println(obj.a[4]);

        System.out.println("Ex function of Default class");
        obj.Ex();

        System.out.println("Ex2 function of Default class");
        obj.Ex2();

    }  
}
