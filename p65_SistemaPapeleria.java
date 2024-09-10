//calcular las ventas de una papeleria

import java.util.Scanner;

public class p65_SistemaPapeleria {
    public static void main(String[] args) {
        char resp, tc;
        int cv, cc, co, cd, ct, ccs, cos, cds;
        Scanner obj = new Scanner(System.in);
        cc=0;
        cd=0;
        co=0;
        ccs=0;
        cos=0;
        cds=0;
        cv = 0;

        System.out.println("---------------------------------\n\n Papeleria 3 copitos, SA. de CV.\n Sistema de ventas de copias\n\n---------------------------------\n");
        
        do {
            cv = cv+1;
            System.out.println("Venta : " + cv );
            System.out.println("Tipo de copia (C)arta $3,(O)ficio $4,(D)oble $6?");
            tc = Character.toUpperCase(obj.next().charAt(0));
            if (tc == 'C'){
                System.out.println("Cantidad?");
                cc = obj.nextInt();
                ccs=ccs+cc;
            }
            else if (tc == 'O'){
                System.out.println("Cantidad?");
                co = obj.nextInt();
                cos=cos+co;
            }
            else {
                System.out.println("Cantidad?");
                cd = obj.nextInt();
                cds=cds+cd;
            }
            System.out.println("Otra venta? (S/N) ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("---------------------------------\n Resumen diario de ventas \n---------------------------------\n\n");
        ct=ccs+cos+cds;
        System.out.println("Ventas realizadas: " + cv);
        System.out.println("----------------------------");
        System.out.println("Carta: " + ccs + " - $" + (ccs*3));
        System.out.println("Oficio: " + cos + " - $" + (cos*4));
        System.out.println("Doble: " + cds + " - $" + (cds*6));
        System.out.println("----------------------------");
        System.out.println("Tot. Ventas: " + ct + " - $" + ((ccs*3)+(cos*4)+(cds*6)));
        System.out.print("Esta venta es una: ");
        if (((ccs*3)+(cos*4)+(cds*6))<50) {
            System.out.print("Venta Moderada");
        } else if (((ccs*3)+(cos*4)+(cds*6))>50&&((ccs*3)+(cos*4)+(cds*6))<=100) {
            System.out.print("Venta Frecuente");
        } else {
            System.out.print("Venta Superada");
        }

    }
    
}