class Human{
    private int age=10;
    private String name="pretham";
    private String place;

    public int getage() //getter
    {
        return age;
    }
    public String getname(){//getter
        return name;
    }
    public String getplace()//getter
    {
        return place;
    }

    public void setplace(String place)//setter
    {
        this.place=place;
    }
   

}


public class Encapsulation {
    public static void main(String srg[])
    {
        Human obj=new Human();
        System.out.println(obj.getage());//we can access only by methods
        System.out.println(obj.getname());

        obj.setplace("kumsi");
        String place=obj.getplace();
        System.out.println(place);
        
    }
    
}
