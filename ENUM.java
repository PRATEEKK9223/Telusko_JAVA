
enum week{
    Monday,tuesday,wednesday,friday,turesday,saturday;
}

enum status{
    running,pending,failed,finish;
}

enum bikes{
    honda(1000),suziky(1000),royal(4000);

    private int price;
    bikes(int price){
        this.price=price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}

public class ENUM {
    public static void main(String[] arg){
        week obj=  week.Monday;
        if(obj==week.Monday)
            System.out.println("yes");


        bikes obj1=bikes.honda;
        System.out.println(obj1+":"+obj1.getPrice());




        System.out.println("now i am using the enum values with switch");

        status s=status.pending;
        switch(s)
        {
            case running:
                System.out.println("is running");
                break;
            case pending:
                System.out.println("plz wait");
                break;
            case finish:
                System.out.println("done");
                break;
            default:
            System.out.println("try again");

        }
    }
    
}
