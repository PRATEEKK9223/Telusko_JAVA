class TreeD_Array{
    public static void main(String arg[]){

        int[][][] num=new int[3][4][3];
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[i].length;j++)
            {
                for(int m=0;m<num[i][j].length;m++)
                {
                    System.out.printf("%d",num[i][j][m]);
                }
                System.out.print(" ");
               
            }
            System.out.println();
        }
        System.out.println();

        for(int n1[][]:num)
        {
            for(int n2[]:n1)
            {
                for(int ele:n2)
                {
                    System.out.printf("%d",ele);
                }
            }
        }
    }
}