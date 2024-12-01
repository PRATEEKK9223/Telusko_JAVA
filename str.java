public class str {
    public static void main(String arg[])
    {
        //actual declarartion of String is
        String name = new String("prateek");
        //String name="prateek";
        int len=name.length();
        System.out.println(len);
        System.out.println(name);//we can not do any modification in this str
        char ch=name.charAt(3);
        System.out.println(ch);

        //stringbuffer or Stringbuilder

        StringBuffer nama=new StringBuffer("lohith");
        nama.append(" akki");
        System.out.println(nama);
        nama.delete(0,3);
        System.out.println(nama);
        nama.insert(0,"loh");
        System.out.println(nama);
        nama.reverse();
        System.out.println(nama);
        nama.reverse();
        System.out.println(nama);
        nama.toString();
        System.out.println(nama);
        nama.append("kumsi");
        System.out.println(nama);
    }
    
}
