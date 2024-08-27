// Dado un numero entre 1 y 6 mostras un contienente
import java.util.Scanner;
public class p35_ContinentesMundo{
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Dado un numero entre 1 y 7 imprime un continente \n");
        System.out.print("Dame un número: ");
        int dia = new Scanner(System.in).nextInt();
        switch (dia) {
            case 1 : System.out.println("Asia");break;
            case 2 : System.out.println("Africa");break;
            case 3 : System.out.println("America del Norte");break;
            case 4 : System.out.println("America del sur");break;
            case 5 : System.out.println("Antartida");break;
            case 6 : System.out.println("Europa");break;
            default : System.out.println("Error");break;
        }
        System.out.println("\n\nProceso terminado ...");
    }
}