class practice{
    public static void example(){
        double[][] num=new double[3][4];
        //Here creating random values and that store to 2d array
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                num[i][j]=(double)(Math.random()*10);
            }
        }

        System.out.println("randamly generated 2D array is");
        for(double ele[]:num){
            for(double i:ele)
            {
                System.out.printf("%.2f ",i);
            }
            System.out.println();
        }
    }
}


class TwoD_Array {
    public static void main(String srg[])
    {
        int array[][]=new int[3][3];
        array[0][0]=10;
        array[0][1]=20;
        array[0][2]=30;
    
        System.out.println(array[0][0]);
        System.out.println(array[0][1]);
        System.out.println(array[0][2]);
        System.out.println(array[1][0]);
        System.out.println("ex1 functio of Array class");
        practice.example();
    }
    
    
}
