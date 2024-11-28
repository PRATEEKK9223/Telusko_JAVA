class Switch{
    public void switch_v1(String str)
    {
        
        switch(str)
        {
            case "sunday","saturday" -> System.out.println("Holiday");

            case "wednesday" ->System.out.println("Half day");

            default -> System.out.println("full day");

        }
    }

    public void switch_v2(String str)
    {
       
        String result;

        result=switch(str)
        {
            case "monday","tuesday","thursday"-> "wakeup at 6am";

            case "wednesday","friday"-> "wakeup at 8am";

            default -> "wakeup at 9am";
        };

        System.out.println(result);
    }

    public String switch_v3(String str)
    {
        String result=switch(str)
        {
            case "monday","thursday","friday" : yield "LAB is there";

            default : yield "LAB is not there";
        };

        return result;
    }
}



public class New_version_switch {

    public static void main(String arg[]){
        String str="sunday";
        String result;
       Switch object1=new Switch();

        object1.switch_v1(str);
        object1.switch_v2(str);
        result=object1.switch_v3(str);
        System.out.println(result);
    }
    
}

