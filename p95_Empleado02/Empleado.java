package p95_Empleado02;

public class Empleado {
    private String Nombre;
    private int Edad;

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado [Nombre=" + Nombre + ", Edad=" + Edad + "]";
    }
    
}
