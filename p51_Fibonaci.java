//fibonaci
import java.util.Scanner;
public class p51_Fibonaci {
    public static void main(String[] args) {
        int i, f, c, cv, c2;
        char resp;
        i=0;
        c=i;
        cv=2;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.println("Ingresa cuantos numeros de la serie Fibonaci desea imprimir: ");
            f = obj.nextInt();
            System.out.printf("%d ", i);
            i=1;
            while (cv<=f) {
                System.out.printf("%d ", i);
                c2 = i;
                i=i+c;
                c=c2;
                cv++;
            }

            System.out.print("\nDeseas continuar (S/N) ? ");resp = Character.toUpperCase(obj.next().charAt(0));
            i=0;
            c=i;
            cv=2;
        } while (resp != 'N');
    }
}
