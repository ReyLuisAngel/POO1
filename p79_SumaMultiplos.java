// Calcula suma de mult de 3 a 4 entre dos numeros
import java.util.Scanner;
public class p79_SumaMultiplos {
    /**
     * suma de multiplos de 3
     * @param n1 inicio de la serie
     * @param n2 fin de la serie
     * @param n3 multiplo
     * @return regresa la sumatoria de los multiplos
     */
    public static int Sm3(int n1, int n2, int n3) {
        int tot=0;
        for(int i=n1;i<=n2;i++){
            if (i%3==0){
                tot=tot+i;
            }
        }
        return tot;
    }
    /**
     * suma de multiplos de 4
     * @param n1 inicio de la serie
     * @param n2 fin de la serie
     * @param n3 multiplo
     * @return regresa la sumatoria de los multiplos
     */
    public static int Sm4(int n1, int n2, int n3) {
        int tot=0;
        for(int i=n1;i<=n2;i++){
            if (i%4==0){
                tot=tot+i;
            }
        }
        return tot;
    }

    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("Dame dos numeros, inicio y final separados por enter. ");
        n1 = obj.nextInt(); n2 = obj.nextInt();
        while(n2<n1){
            System.out.println("Debe ser el inicio mayor a el final favor de ingresar los numeros otra ves.");
            n1 = obj.nextInt(); n2 = obj.nextInt();
        }
        System.out.println("Cual es el multiplo que deseas usar, 3 o 4? ");
        n3 = obj.nextInt();
        if (n3 == 3){
            System.out.printf("\nLa suma de los multiplos es : " + Sm3(n1,n2,n3));
        }
        else {
            System.out.printf("\nLa suma de los multiplos es : " + Sm4(n1,n2,n3));
        }
    }
}