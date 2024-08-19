// Calcula farenheit a celcius
import java.util.Scanner;
public class p12_FarenheirACelcius {
    public static void main(String[] args) {
        double fa1, ce2;
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Calculando temperatura de Farenheit a Celcius\n");
        System.out.print("Dame la temperatura en Farenheit: "); fa1 = obj.nextFloat();
        ce2 = (fa1-32)*(5.0/9.0);
        System.out.printf("\nLa temperatura en Celcius es: " + ce2 + " grados");

    }
}