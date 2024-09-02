// Imprime pares ascendente
import java.util.Scanner;
public class p49_ParesAscendente {
    public static void main(String[] args) {
        int c, f, s, n;
        float p;
        char resp;
        Scanner obj = new Scanner(System.in);
        c=100;
        s=1;
        n=0;
        resp = 'S';
        while ( resp != 'N' ) {
            System.out.println("El programa inicia en 100 y decrese, hasta que numero quieres que imprimima? (99-infinito)");
            f=obj.nextInt();

            while( c >= f ) {
                System.out.print(c+" ");
                c=c-2;
                s=s+c;
                n=n+1;
            }
            p= s/n;
            System.out.println("\nConteo terminado, la suma total de los numeros es: "+ s + " Y su promedio es: " + p);
            System.out.println("Deseas continuar? S/N");
            c=100;
            s=1;
            n=0;
            resp = 'S';
            resp= Character.toUpperCase(obj.next().charAt(0));
            }
        }
    }