package p98_Circulo;

public class app {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(10.40);
        System.out.println(c1);
        Circulo c2 = new Circulo();
        c2.setRadio(12.45);

        System.out.print("\033[H\033[2J");
        System.out.flush();// limpiar pantalla

        System.out.println(c2.toString());
        System.out.println("El radio es : " + c2.getRadio());
        System.out.println("Area = " + c1.getArea());
        System.out.println("Circunferencia = " + c1.getCircunferencia());
    }
}