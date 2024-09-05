// Imprime una pirámide de numeros
import java.util.Scanner;
public class p62_SecuenciaNumeros2 {
    public static void main(String[] args) {
        int i,j,n, car;
        char resp;
        car = 1;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Cuantos renglones? "); n = obj.nextInt();
            for(i=1; i<=n; i++) {

                for(j=1; j<=i; j++) {

                    System.out.print(car);
                    car++;
                }
                car=1;
            System.out.println();
            }
            System.out.print("\nDeseas continuar (S/N) ?");
            resp=Character.toUpperCase(obj.next().charAt(0));
    } while( resp!= 'N');
    System.out.println("\nProceso terminado ..");
    }
}