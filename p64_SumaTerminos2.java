// Suma de n términos 1111111
import java.util.Scanner;
public class p64_SumaTerminos2 {
    public static void main(String[] args) {
        int i,j,n;
        int f, r;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            r=0;
            f=0;
            System.out.print("Cuantos números? "); n = obj.nextInt();
            for(i=1; i<=n; i++) {
                f = f + (int)(Math.pow(10, i-1));
                System.out.printf("%,d + ",f);
                r += f;
            }
            System.out.printf(" \nLa suma de los terminos es = %,d\n",r);
            System.out.print("\nDeseas continuar (S/N)? ");
            resp=Character.toUpperCase(obj.next().charAt(0));
        } while( resp!= 'N');
        System.out.println("\nProceso terminado ..");
    }
}