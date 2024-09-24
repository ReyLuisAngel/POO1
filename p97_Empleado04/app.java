package p97_Empleado04;

import java.util.ArrayList;

public class app {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        int m=0,f=0,c=0,s=0;

        Empleado empleado1 = new Empleado("Pepito", 23, 'M', true);
        Empleado empleado2 = new Empleado();

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(new Empleado("Dario", 22, 'M', false));
        empleados.add(new Empleado("Pepe", 32, 'M', false));

        empleado2.setNombre("Juana");
        empleado2.setEdad(20);
        empleado2.setSexo('F');
        empleado2.setCazado(false);

        System.out.print("\033[H\033[2J");System.out.flush();//limpiar pantalla

        System.out.println("Todos los empleados: ");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
            if(empleado.getSexo()=='M') m++;
            if(empleado.getSexo()=='F') f++;

            if(empleado.isCazado()) c++; else s++;
        }
        System.out.println("Masculinos: "+m);
        System.out.println("Femeninas: "+f);
        System.out.println("Cazados: "+c);
        System.out.println("Solteros: "+s);
    }
    
}
