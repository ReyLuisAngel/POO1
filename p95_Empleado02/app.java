package p95_Empleado02;

public class app {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();//Instanciar
        Empleado empleado2 = new Empleado();//Instanciar

        //Asignar valores a las propiedades
        empleado1.setNombre("Carlitos");
        empleado1.setEdad(16);

        empleado2.setNombre("Pedrito");
        empleado2.setEdad(17);

        System.out.print("\033[H\033[2J");System.out.flush();//limpiar pantalla

        System.out.println("Empleado 1 nombre: "+ empleado1.getNombre());
        System.out.println("Empleado 1 edad: "+ empleado1.getEdad());
        System.out.println(empleado1.toString());
        System.out.println("Empleado 2 nombre: "+ empleado2.getNombre());
        System.out.println("Empleado 2 edad: "+ empleado2.getEdad());
        System.out.println(empleado2.toString());
    }
    
}
