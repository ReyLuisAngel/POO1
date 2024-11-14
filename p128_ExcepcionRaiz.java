import java.util.Scanner;

public class p128_ExcepcionRaiz {
    public static void main(String[] args) {

        try {
            System.out.println("Dame un numero flotante: ");
            double num = new Scanner(System.in).nextInt();
            double r;
            r=Math.sqrt(num);
            System.out.println("El resultado es " + r);
        } catch (Exception e) {

            System.out.println("No puedo calcular la raiz cuadrada");

        }
    }
}