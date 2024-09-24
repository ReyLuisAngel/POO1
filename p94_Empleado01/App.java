package p94_Empleado01;

//Programa principal

public class App {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado(); //Instanciar
        Empleado empleado2 = new Empleado(); //Instanciar

        //Asignar valores a las propiedades
        empleado1.Nombre = "Juan Juarez";
        empleado1.Edad = 45;
        empleado2.Nombre = "Maria Lopez";
        empleado2.Edad = 20;

        Empleado empleado3;
        empleado3 = new Empleado(); //Instanciar
        //Asignar valores a las propiedades
        empleado3.Nombre = "Patito Jorge";
        empleado3.Edad = 15;

        System.out.print("\033[H\033[2J");System.out.flush();//limpiar pantalla

        System.out.println("Empleado 1: " + empleado1.Nombre);
        System.out.println("Edad empleado 1: " + empleado1.Edad);
        System.out.println(empleado1.toString());//Invocar metodo toString del objeto
        System.out.println("Empleado 2: " + empleado2.Nombre);
        System.out.println("Edad empleado 2: " + empleado2.Edad);
        System.out.println(empleado2.toString());//Invocar metodo toString del objeto
        System.out.println("Empleado 3: ");
        System.out.println(empleado3.toString());//Invocar metodo toString del objeto
    }
}