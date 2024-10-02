package p104_PuntoCirculo;


public class Circulo {
    private Punto Centro;
    private double Radio;

    // Constructores
    public Circulo() {}

    public Circulo(Punto centro, double radio) {
        Centro = centro;
        Radio = radio;
    }
    //Metodos
    public Punto getCentro() {
        return Centro;
    }

    public void setCentro(Punto centro) {
        Centro = centro;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }
    
    public double getArea() {
        double Are;
        Are=0;
        Are = 3.1516*(getRadio()*getRadio());
        return Are;
    }

    public double getCircunferencia() {
        double Circ;
        Circ=0;
        Circ=2*3.1416*getRadio();
        return Circ;
    }

    @Override
    public String toString() {
        return "Circulo [Centro=" + Centro + ", Radio=" + Radio + "]";
    }

    
}
