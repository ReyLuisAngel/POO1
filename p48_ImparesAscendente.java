// Imprime impares descendene
import java.util.Scanner;
public class p48_ImparesAscendente {
    public static void main(String[] args) {
        int c, f, s, n;
        float p;
        char resp;
        Scanner obj = new Scanner(System.in);
        c=1;
        s=1;
        n=0;
        resp = 'S';
        while ( resp != 'N' ) {
            System.out.println("Hasta que numero quieres imprimir?");
            f=obj.nextInt();

            while( c <= f ) {
                System.out.print(c+" ");
                c=c+2;
                s=s+c;
                n=n+1;
            }
            p= s/n;
            System.out.println("\nConteo terminado, la suma total de los numeros es: "+ s + " Y su promedio es: " + p);
            System.out.println("Deseas continuar? S/N");
            c=1;
            s=1;
            n=0;
            resp = 'S';
            resp= Character.toUpperCase(obj.next().charAt(0));
            }
        }
    }