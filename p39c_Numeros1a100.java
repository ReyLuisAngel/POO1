// Imprime los números del 1 al 100 usando ciclo while

import java.util.Scanner;

public class p39c_Numeros1a100 {
    public static void main(String[] args) {
        int c, f;
        Scanner obj = new Scanner(System.in);
        c=1;
        System.out.println("Cuantos numeros debe saltarse al incrementar?");
        f=obj.nextInt();
        while( c <= 100 ) {
            System.out.print(c+" ");
            c=c+f;
        }
        System.out.println("\nProceso terminado ...");
        }
        
    }