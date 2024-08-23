// Calcula farenheit a celcius
import java.util.Scanner;
public class p15_PesoADolar {
    public static void main(String[] args) {
        double pes, dol, cot;
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Calculando peso a dolar\n");
        System.out.print("Dame los pesos: "); pes = obj.nextFloat();
        System.out.print("Dame la cotizacion: "); cot = obj.nextFloat();
        dol = pes/cot;
        System.out.printf("\nLa convercion es: " + dol + " dolares");

    }
}