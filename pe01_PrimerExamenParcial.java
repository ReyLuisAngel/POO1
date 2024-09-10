//examen parcial 1, universidad conteo 
import java.util.Scanner;
public class pe01_PrimerExamenParcial {
    public static void main(String[] args) {
        int Edad, nr, ca, t, cd, cm, cf, ct;
        float pe;
        char resp, par, Sexo;
        Scanner obj = new Scanner(System.in);
        Scanner obj2 = new Scanner(System.in);
        String nombre;

        pe=0;
        nr=0;
        ca=0;
        cd=0;
        ct=0;
        cm=0;
        cf=0;
        t=0;

        do {
            System.out.println("Ingresa los datos necesarios separados por un enter, Nombre, Edad, Sexo ((M)asculino, (F)emenino) y tipo de participante: ");
            System.out.println("(A)lumno, (D)ocente y (T)rabajador");
            nombre = obj2.nextLine();
            Edad = obj.nextInt();
            Sexo = Character.toUpperCase(obj.next().charAt(0));
            par = Character.toUpperCase(obj.next().charAt(0));
            if (Edad<23) {
                System.out.println("Lo sentimos no cumple con la edad suficiente para entrar.");
                nr = nr+1;
            } else {
                System.out.println("Bienvenido, " + nombre + "\ntu edad es: " + Edad + "\ntu sexo es: " + Sexo + "\ny el tipo de participante es:" + par);
                pe=pe+Edad;
                if (par == 'A') {
                    ca=ca+1;
                    t=t+1;
                } else if (par == 'D') {
                    cd=cd+1;
                    t=t+1;
                } else {
                    ct=ct+1;
                    t=t+1;
                }
                if (Sexo == 'M') {
                    cm=cm+1;
                } else {
                    cf=cf+1;
                }

            }
            System.out.println("Otro alumno? (S/N) ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("Total de alumnos: " + ca);
        System.out.println("Total de docentes: " + cd);
        System.out.println("Total de trabajadores: " + ct);
        System.out.println("Total de hombres: " + cm);
        System.out.println("Total de mujeres: " + cf);
        System.out.println("Total de participantes: " + (cm+cf) );
        System.out.println("Promedio de edad: " + (pe/(cm+cf)));
        System.out.println("Total de rechazados: " + nr);
        System.out.println("Total dinero recaudado de alumnos: " + (ca*40));
        System.out.println("Total dinero recaudado de docentes: " + (cd*60));
        System.out.println("Total dinero recaudado de trabajadores: " + (ct*80));
        System.out.println("Total dinero recaudado de todos los participantes: " + ((ca*40)+(cd*60)+(ct*80)));
        if (((ca*40)+(cd*60)+(ct*80))<50) {
            System.out.println("El evento concluye con ganancias BAJAS");
        } else if (((ca*40)+(cd*60)+(ct*80))>=50 && ((ca*40)+(cd*60)+(ct*80))<1000) {
            System.out.println("El evento concluye con ganancias MODERADAS");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias");
        }
        
    }
}
