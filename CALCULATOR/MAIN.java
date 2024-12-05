package CALCULATOR;

public class MAIN {
    public static void main(){
        version_3 obj =new version_3();

        double sum=obj.add(5,6);
        System.out.println(sum);
        double sub=obj.sub(5,6);
        System.out.println(sub);

        double product =obj. mult(4.3,6.4);
        System.out.println(product);

        double qutiont =obj.dvd(10,5);
        System.out.println(qutiont);

        obj.power(2,4);
    }
    
}

//if you want do tis outside the package 
//import CALCULATOR.version_1;
//import CALCULATOR.version_3;
