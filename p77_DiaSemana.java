// Dado un numero entre 1 y 7 imprime el dia de la semana
import java.util.Scanner;
public class p77_DiaSemana {
    /**
     * Imprime el dia segun el numero
     * @param dia (int) numero del dia que debe imprimirse entre 1 y 7
     * @return esta funcion regresa el dia indicado
     */
        public static String Dia(int dia) {
            String da="n";
            switch (dia) {
                case 1 : da=" Lunes";break;
                case 2 : da="Martes";break;
                case 3 : da="Miércoles";break;
                case 4 : da="Jueves";break;
                case 5 : da="Viernes";break;
                case 6 :da="Sábado";break;
                case 7 : da="Domingo";break;
                default : da="Día inválido";break;
            }
            return da;
        }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Dame un numero entre 1 y 7 imprime el dia de la semana\n");
        int dia = new Scanner(System.in).nextInt();
        System.out.printf("\nEl dia es : " + Dia(dia));
        System.out.println("\n\nProceso terminado ...");
    }
}