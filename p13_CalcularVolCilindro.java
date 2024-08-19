// Calcula la hipotenusa de un triangulo
import java.util.Scanner;
public class p13_CalcularVolCilindro {
    public static void main(String[] args) {
        double radio, altura, vol;
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Calculando volumen del cilindro\n");
        System.out.print("Dame el radio: "); radio = obj.nextFloat();
        System.out.print("Dame la altura: "); altura = obj.nextFloat();
        vol = 3.1416 * (radio * radio) * altura;
        System.out.printf("\nEl vol del cilindro es: %.2f CM cubicos",vol);

    }
}