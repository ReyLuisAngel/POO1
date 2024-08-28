// Imprime los números del 1 al numero que el usuario decida
import java.util.Scanner;
public class p39b_Numeros1a100 {
    public static void main(String[] args) {
        int c, f;
        Scanner obj = new Scanner(System.in);
        c=1;
        System.out.println("Hasta que numero quieres imprimir?");
        f=obj.nextInt();

        while( c <= f ) {
            System.out.print(c+" ");
            c++;
        }
        System.out.println("\nProceso terminado ...");
        }
        
    }