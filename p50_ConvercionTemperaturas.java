// Imprime tabla de conversión de temperaturas
import java.util.Scanner;
public class p50_ConvercionTemperaturas {
    public static void main(String[] args) {
        int ini, fin;
        float f, c;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("Imprime una tabla de conversion de centigrados a Farenheit\n");
            do {
                
                    System.out.print("Ingresa desde que temperatura desea iniciar: "); ini = obj.nextInt();
                    System.out.print("Hasta que temperatura se mostrara? "); fin = obj.nextInt();
                    if (ini > fin) {
                        System.out.println("Error el inicio debe ser menor al final, vuelva a ingresar los datos");
                        while (ini>fin) {
                            System.out.print("Ingresa desde que temperatura desea iniciar: "); ini = obj.nextInt();
                            System.out.print("Hasta que temperatura se mostrara? "); fin = obj.nextInt();
                    }
                }
            } while( fin < ini );
                c=ini;
                System.out.println("Centigrado\tFarenheit");
                while( c<=fin ) {
                    f = ( c * 9 / 5 ) + 32;
                    System.out.printf("%.0f\t\t%.2f\n",c,f); 
                    c++;
                }
            System.out.print("\nDeseas continuar (S/N) ? ");resp = Character.toUpperCase(obj.next().charAt(0));
        } while( resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}