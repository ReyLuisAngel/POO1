package p98_Circulo;

public class Circulo {
    private double Radio;
    private double Area;
    private double circunferencia;
    
    public Circulo() {}

    public Circulo(double radio) {
        Radio = radio;
    }
    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }
    public double getArea() {
        Area = 3.1416*(Radio*Radio);
        return Area;
    }
    public void setArea(double area) {
        
        Area = area;
    }
    public double getCircunferencia() {
        this.circunferencia = 2*3.1416*Radio;
        return circunferencia;
    }
    public void setCircunferencia(double circunferencia) {
        this.circunferencia=circunferencia;
    }

    @Override
    public String toString() {
        return "Circulo [Radio=" + Radio + "]";
    }

    
}
