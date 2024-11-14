import java.util.Scanner;
import java.util.InputMismatchException;

public class p129_ExcepcionDulces {
    public static void main(String[] args) {

        try {
            System.out.println("Dame el numero de chiquillos: ");
            double num = new Scanner(System.in).nextFloat();
            System.out.println("Dame el numero de dulces: ");
            double num2 = new Scanner(System.in).nextFloat();
            double r;
            r=num2/num;
            System.out.println("A cada chiquillo le toca: " + r + " dulces");
        } catch (ArithmeticException e) {

            System.out.println("No puedo repartir nada, si no hay dulces");

        } catch (InputMismatchException e) {

            System.out.println("Los chiquillos y los dulces deben ser números");

        }
    }
}