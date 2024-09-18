// Calcula conversiones
import java.util.Scanner;
public class p78_MedidasLongitud {
    public static double Cm(float a) {
        double tot;
        tot = a*2.54;
        return tot;
    }
    public static double Ps(float a) {
        double tot;
        tot = a*3.281;
        return tot;
    }

    public static void main(String[] args) {
        char resp;
        float n;
        Scanner obj = new Scanner(System.in);
        Scanner obj2 = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("Escoge de que medidas quieres hacer la convercion: [P]ulgadas a centimetros y [M]etros a pies: ");
        resp=Character.toUpperCase(obj.next().charAt(0));
        if (resp == 'P'){
            System.out.println("Dame la cantidad que deseas convertir: ");
            n=obj2.nextFloat();
            System.out.println("La convercion total de centimetros es: " + Cm(n));
        } else {
            System.out.println("Dame la cantidad que deseas convertir: ");
            n=obj2.nextFloat();
            System.out.println("La convercion total de pies es: " + Ps(n));
        }
    }
}