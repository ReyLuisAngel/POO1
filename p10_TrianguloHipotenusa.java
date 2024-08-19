// Calcula la hipotenusa de un triangulo
import java.util.Scanner;
public class p10_TrianguloHipotenusa {
    public static void main(String[] args) {
        double hip, long1, long2;
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Calculando la hipotenusa de un triangulo\n");
        System.out.print("Dame el primer lado: "); long1 = obj.nextFloat();
        System.out.print("Dame el segundo lado: "); long2 = obj.nextFloat();
        hip = Math.sqrt(long1 * long1 + long2 * long2);
        System.out.printf("\nLa hipotenusa del triangulo es: %.2f",hip);

    }
}