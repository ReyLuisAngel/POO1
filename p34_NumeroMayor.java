//verificar cual num es mayor
import java.util.Scanner;

public class p34_NumeroMayor {
 
        public static void main(String[] args) {
        int n1, n2, n3;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Verificar que num es mayor\n");
        System.out.print("Dame el primer numero: "); n1 = obj.nextInt();
        System.out.print("Dame el seguno numero: "); n2 = obj.nextInt();
        System.out.print("Dame el tercer numero: "); n3 = obj.nextInt();
        if( n2 > n1 & n2 >n3)
        System.out.println("\nEl segundo num: " + n2 + " es el mayor");
        else if( n1 > n2 & n1 >n3)
        System.out.println("\nEl primer num: " + n1 + " es el mayor");
        else if ( n3 > n2 & n3 > n1)
        System.out.println("\nEl tercer num: " + n3 + " es el mayor");
        else
        System.out.println("\nError");
    }
}