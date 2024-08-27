// Acepta a un estudiante en base a su edad y sus calificaciones
import java.util.Scanner;
public class p38_AceptarEstudianteV2 {
    public static void main(String[] args) {
        String nombre;
        int edad, sexo;
        float c1,c2, c3;
        Scanner obj = new Scanner(System.in);
        Scanner obj2 = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Acepta a un estudiante en base a su edad y sus calificaciones\n");
        System.out.print("Dame tu sexo(Femenino 1, Masculino 2): "); 
        sexo = obj.nextInt();
        System.out.print("Dame la edad: "); 
        edad = obj.nextInt();
        System.out.print("Dame tu nombre: "); 
        nombre = obj2.nextLine();
        
        if (sexo == 1) {
            
        
        if( edad >= 21 ) {
            System.out.println("Eres suficientemente grande, continuamos.");
            System.out.println("Dame tres calificaciones separadas por Enter:");
            c1 = obj.nextFloat();
            c2 = obj.nextFloat();
            c3 = obj.nextFloat();
            if( c1 >= 8 && c2 >= 8 && c3>= 8)
                System.out.printf("\nBIENVENIDA %s tienes %d y calificaciones %.2f,%.2f,%.2f ... ACEPTADA\n",nombre,edad,c1,c2,c3);
            else
                System.out.println("\nSolo aceptamos estudiantes con calificaciones de 8 en adelante");

            }
        else

            System.out.println("Solo aceptamos estudiantes mayores de edad");
        } else {
            System.out.println("Solo aceptamos mujeres");
        }
            System.out.println("\nProceso terminado ...");
    }
}