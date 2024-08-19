// Calcula tiempo desde horas
import java.util.Scanner;
public class p14_CalcularTiempo {
    public static void main(String[] args) {
        double horas, dias, min, seg;
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Calculando el tiempo\n");
        System.out.print("Dame el tiempo en horas: "); horas = obj.nextFloat();
        dias=horas/24;
        min=horas*60;
        seg=(horas*60)*60;
        System.out.printf("\nEltiempo en dia es: " + dias +"Dias");
        System.out.printf("\nEltiempo en minutos es: " + min +"Minutos");
        System.out.printf("\nEltiempo en segundos es: " + seg +"Segundos");

    }
}