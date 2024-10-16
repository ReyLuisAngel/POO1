package p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador{
    private int subordinados;
    private int proyectos;


    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario, int subordinados, int proyectos) {
        super(nombre, sexo, descripcion, salario);
        this.subordinados = subordinados;
        this.proyectos = proyectos;
    }

    public double getTotal() {
        double Total;
        Total = getSalario() + getBono();
        return Total;
    }

    public int getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(int subordinados) {
        this.subordinados = subordinados;
    }

    public int getProyectos() {
        return proyectos;
    }

    public void setProyectos(int proyectos) {
        this.proyectos = proyectos;
    }

    @Override
    public double getBono(){
        double bono;
        bono = 0;
        bono = (getSalario() * 0.15) + (proyectos * 100)+ (subordinados * 10);
        return bono;
    }

    @Override
    public String toString() {
        return "JugadorEntrenador [Nombre=" + Nombre + ", subordinados=" + subordinados + ", Sexo=" + Sexo
                + ", proyectos=" + proyectos + ", Descripcion=" + Descripcion + ", Salario=" + Salario + ", Total="
                + Total + "]";
    }

    
    
    
}
