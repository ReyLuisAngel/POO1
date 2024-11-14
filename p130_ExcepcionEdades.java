import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class p130_ExcepcionEdades {
    public static void main(String[] args) {
        System.out.println("Captura las edades de 5 personas ");
        List<String> arreglo = new ArrayList<String>();
        try {
            for(int i =1 ; i< 6;i++){
                System.out.println("Persona " + i);
                int num = new Scanner(System.in).nextInt();
                arreglo.add(num);
            }
            System.out.println("Captura las edades de 5 personas ");
            double num = new Scanner(System.in).nextFloat();
        } catch (ArithmeticException e) {

            System.out.println("No puedo repartir nada, si no hay dulces");

        } catch (InputMismatchException e) {

            System.out.println("Los chiquillos y los dulces deben ser números");

        }
    }
}