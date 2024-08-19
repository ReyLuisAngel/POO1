// Calcula la hipotenusa de un triangulo
import java.util.Scanner;
public class p11_CalcularAngulo {
    public static void main(String[] args) {
        double ang1, ang2, ang3;
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Calculando un tercer angulo\n");
        System.out.print("Dame el primer angulo: "); ang1 = obj.nextFloat();
        System.out.print("Dame el segundo angulo: "); ang2 = obj.nextFloat();
        ang3 = 180 - (ang1+ang2);
        System.out.printf("\nEl tercer angulo es: %.2f grados",ang3);

    }
}