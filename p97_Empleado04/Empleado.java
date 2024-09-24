package p97_Empleado04;

public class Empleado {
    private String Nombre;
    private int Edad;
    private char Sexo;
    private boolean Cazado;
    
    public Empleado() {
    }
    public Empleado(String nombre, int edad, char sexo, boolean cazado) {
        Nombre = nombre;
        Edad = edad;
        Sexo = sexo;
        Cazado = cazado;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public char getSexo() {
        return Sexo;
    }
    public void setSexo(char sexo) {
        Sexo = sexo;
    }
    public boolean isCazado() {
        return Cazado;
    }
    public void setCazado(boolean cazado) {
        Cazado = cazado;
    }
    
    @Override
    public String toString() {
        return "Empleado [Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + ", Cazado=" + Cazado + "]";
    }

    
}
