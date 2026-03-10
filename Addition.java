
import java.util.Scanner;
public class Addition {
    public static double addDistances(double d1, double d2) {
        return d1 + d2;
    }
    public static void display( double total) {
          
        System.out.println("total = " + total);
       
    }
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter  distance 1");
        double d1 = sc.nextDouble();
        System.out.println("enter d2");
        double d2 = sc.nextDouble();
        double total = addDistances(d1, d2) ;
        display(total);
        sc.close();
       


    }
    
}
