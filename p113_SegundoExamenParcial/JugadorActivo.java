package p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador{
    private int partidos;
    private int goles;

    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidos, int goles) {
        super(nombre, sexo, descripcion, salario);
        this.partidos = partidos;
        this.goles = goles;
    }
    
    public double getTotal() {
        double Total;
        Total = getSalario() + getBono();
        return Total;
    }

    @Override
    public double getBono(){
        double bono;
        bono = 0;
        bono = (getSalario() * 0.10) + (partidos * 50)+ (goles * 5);
        return bono;
    }

    @Override
    public String toString() {
        return "JugadorActivo [Nombre=" + Nombre + ", partidos=" + partidos + ", Sexo=" + Sexo + ", goles=" + goles
                + ", Descripcion=" + Descripcion + ", Salario=" + Salario + ", Total=" + Total + "]";
    }

    
    
}
