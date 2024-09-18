// Dado un numero entre 1 y 7 imprime el dia de la semana
import java.util.Scanner;
public class p80_Angulo {

        public static String Ang(int ang) {
            String da="n";
            if (ang<=90){
                da="agudo";
            } else if (ang==90) {
                da="recto";
            } else if(ang>90 && ang<180){
                da="obtuso";
            } else if (ang==180){
                da="llano";
            } else{
                da="concavo";
            }
            return da;
        }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Dame un numero entre 0 y 360.\n");
        int ang = new Scanner(System.in).nextInt();
        while (ang<0||ang>360) {
            System.out.println("Debe ingresar un numero entre 0 y 360");
            ang = new Scanner(System.in).nextInt();
        }
        System.out.printf("\nEl angulo es : " + Ang(ang));
        System.out.println("\n\nProceso terminado ...");
    }
}