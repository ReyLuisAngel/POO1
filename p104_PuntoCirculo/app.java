package p104_PuntoCirculo;

public class app {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(new Punto(5, 8), 6);
        Circulo circulo2 = new Circulo(new Punto(30, 46), 2);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(circulo1);
        System.out.println(circulo2);
        System.out.println("Circulo 1 Area : " + circulo1.getArea());
        System.out.println("Circulo 1 Circunferencia : " + circulo1.getCircunferencia());
        System.out.println("Circulo 1 Centro : " + circulo1.getCentro());
        System.out.println("Distancia a Circulo 2 : " + circulo1.getCentro().getDistancia(circulo1.getCentro(), circulo2.getCentro()));
    }
}