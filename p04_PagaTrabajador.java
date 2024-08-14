//Calcular el pago de un trabajador
import java.util.Scanner;

public class p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga, tasa, impuesto, pagabruta, paganeta;
        Scanner obj = new Scanner(System.in);

        System.out.println("Nombre del trabajador: "); nombre = obj.nextLine();
        System.out.println("Horas trabajadas: "); horas = obj.nextInt();
        System.out.println("Paga x hora: "); paga = obj.nextFloat();
        tasa = 0.03;

        pagabruta = horas * paga;
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;

        System.out.println("\n Resumen de pagos\n");
        System.out.println(String.format("El trabajador %s, trabajo %d horas, a una paga de %.2f pesos la hora, con una tasa de %.2f", nombre, horas, paga, tasa));
        System.out.println(String.format("Paga Bruta  = %.2f",pagabruta));
        System.out.println(String.format("Impuestos   = %.2f",impuesto));
        System.out.println(String.format("Paga Neta   = %.2f",paganeta));
    }
}
