class Student{
    
    int RollNo;
    char section;
    String name;

}

public class ArrayOfObjects {
    public static void main(String arg[]){
        Student s1=new Student();
        s1.RollNo=9223;
        s1.section='B';
        s1.name="prateek";

        Student s2=new Student();
        s2.RollNo=8618;
        s2.section='B';
        s2.name="vihan";


        Student students[]=new Student[2];//this is array of students objects...

        students[0]=s1;
        students[1]=s2;
        System.out.println("rollNumber"+"  "+"section"+" "+"\tname");
        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].RollNo+"\t\t"+students[i].section+"\t"+students[i].name);
        }

    }
    
}
