// Muestra el tipo de angulo según los grados
import java.util.Scanner;
public class p26_TipoAngulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Muestra el tipo de ángulo \n");
        System.out.print("Dame un ángulo entre 0 y 360 grados:");
        int angulo = new Scanner(System.in).nextInt();
        System.out.print("El ángulo que introdujiste ");
        if(angulo<90)

            System.out.println("es: agudo");

        if(angulo==90)

            System.out.println("es: recto");

        if(angulo>90 && angulo<180)

            System.out.println("es: obtuso");

        if(angulo==180)

            System.out.println("es: llano");

        if(angulo>180 && angulo<360)

            System.out.println("es: concavo");

        if(angulo==360)
            System.out.println("es: completo");
            System.out.println("\nProceso terminado ....");
    }
}