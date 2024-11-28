class computer{
    public void playMusic()
    {
        System.out.println("music is playing.....");
    }

    public String userName(int ID)
    {
        if(ID==9223)
            return "PRATEEK K";
        return "invalid ID";
    }

}


public class methods_In_java {
    public static void main(String args[])
    {
        computer obj=new computer();
        obj.playMusic();
        String str;
        str=obj.userName(9223);
        System.out.println("user name of 9223 is "+str);
        
    }
    
}
