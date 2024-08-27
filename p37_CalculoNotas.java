//Calcular promedio y segun el resultado mostrar opciones
import java.util.Scanner;

public class p37_CalculoNotas {
        public static void main(String[] args) {
        double n1, n2, n3, n4, n5;
        double T;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Calcular promedio\n");
        System.out.print("Dame el primer numero: "); n1 = obj.nextDouble();
        System.out.print("Dame el seguno numero: "); n2 = obj.nextDouble();
        System.out.print("Dame el tercer numero: "); n3 = obj.nextDouble();
        System.out.print("Dame el cuarto numero: "); n4 = obj.nextDouble();
        System.out.print("Dame el quinto numero: "); n5 = obj.nextDouble();
        T=(n1+n2+n3+n4+n5)/5;
        if(T>0 && T<=6)
        System.out.println("\nQuedas reprobado");
        else if(T>6 && T<=7)
        System.out.println("\nPasas de panzaso");
        else if (T>7 && T<=8)
        System.out.println("\nMuy bien puedes mejorar");
        else if (T>8 && T<=9)
        System.out.println("Excelente sigue asi");
        else if (T>9 && T<=10)
        System.out.println("Perfecto");
        else
        System.out.println("\nError");
    }
}