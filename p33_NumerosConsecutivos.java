//verificar que los numeros sean consecutivos
import java.util.Scanner;

public class p33_NumerosConsecutivos {
 
        public static void main(String[] args) {
        int n1, n2, n3;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Verificar si los numeros son consecutivos\n");
        System.out.print("Dame el primer numero: "); n1 = obj.nextInt();
        System.out.print("Dame el seguno numero: "); n2 = obj.nextInt();
        System.out.print("Dame el tercer numero: "); n3 = obj.nextInt();
        if( n2 == n1+1 & n3 == n1+2)
        System.out.println("\nSi son consecutivos");
        else
        System.out.println("\nError");
    }
}

