package p96_Empleado03;

public class app {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jorjito",20);
        Empleado empleado2 = new Empleado("Nepomuseno",21);
        Empleado empleado3 = new Empleado();
        
        empleado3.setNombre("Pedrito");
        empleado3.setEdad(19);

        System.out.print("\033[H\033[2J");System.out.flush();//limpiar pantalla


        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());

        empleado2.setNombre("Anastacia");
        empleado2.setEdad(17);

        System.out.println("Empleado 2 despues de la transformacion: " + empleado2.toString());
    }



}
