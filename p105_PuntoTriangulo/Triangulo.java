package p105_PuntoTriangulo;

public class Triangulo {
    private Punto V1;
    private Punto V2;
    private Punto V3;
   
//Constructores
    public Triangulo() {}

    public Triangulo(Punto v1, Punto v2, Punto v3) {
        V1 = v1;
        V2 = v2;
        V3 = v3;
    }
//Metodos

    public Punto getV1() {
        return V1;
    }

    public void setV1(Punto v1) {
        V1 = v1;
    }

    public Punto getV2() {
        return V2;
    }

    public void setV2(Punto v2) {
        V2 = v2;
    }

    public Punto getV3() {
        return V3;
    }

    public void setV3(Punto v3) {
        V3 = v3;
    }
    
    public double getPerimetro() {
        double per;
        per=0;
        per= (V1.getDistancia(V2, V1))+(V2.getDistancia(V2, V3))+(V3.getDistancia(V3, V1));
        return per;
    }

    public String getTipo() {
        String tip;
        tip = "";
        if ((V1.getDistancia(V2, V1))==(V2.getDistancia(V2, V3))&&(V1.getDistancia(V2, V1)==(V3.getDistancia(V3, V1)))) tip="Equilatero";
        else if ((V1.getDistancia(V2, V1))==(V2.getDistancia(V2, V3))||(V1.getDistancia(V2, V1)==(V3.getDistancia(V3, V1)))||(V1.getDistancia(V3, V1)==(V3.getDistancia(V2, V3)))) tip="Isoseles";
        else tip = "Escaleno";
        return tip;
    }

    @Override
    public String toString() {
        return "Triangulo [V1=" + V1 + ", V2=" + V2 + ", V3=" + V3 + "]";
    }

    
}
