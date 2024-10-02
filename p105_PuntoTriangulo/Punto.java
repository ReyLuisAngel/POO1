package p105_PuntoTriangulo;

import java.util.*;
public class Punto {
    private int X;
    private int Y;
    
    //Constructores
    public Punto() {}

    public Punto(int x, int y) {
        X = x;
        Y = y;
    }

    //Metodos
    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public double getDistancia(Punto punto, Punto punto2) {
        double dis;
        dis = 0;
        dis = Math.sqrt(((((punto.getX() - punto2.getX())*(punto.getX() - punto2.getX()))+((punto.getY() - punto2.getY())*(punto.getY() - punto2.getY())))));
        return dis;
    }

    @Override
    public String toString() {
        return "Punto [X=" + X + ", Y=" + Y + "]";
    }
    
    
}
