import java.util.Scanner;
public class p36_CompraPizza {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Escoge el diametro de tu pizza ingresa 1, 2  o 3(ch 5$,m 10$,g 20$)\n");
        int tp = new Scanner(System.in).nextInt();
        System.out.println("Cual sera la cantidad de unidades de tu pedido: \n");
        int cp = new Scanner(System.in).nextInt();
        double T, Tr;
        switch (tp) {
            case 1:
                T=5*cp;
                if (T >= 2000){
                    System.out.println("Se aplicara 15% de descuento a tu compra.");
                    System.out.println("El tamaño que escogio fue chico");
                    System.out.println("La cantidad de unidades que pidio fue: " + cp);
                    System.out.println("El total de su compra fueron: " + T + ". Se aplicara un 15% de descuento: " + (T*.15));
                    System.out.println("El total a pagar es: " + (T*0.85));
                } else {
                    System.out.println("No se aplicara descuento a tu compra.");
                    System.out.println("El tamaño que escogio fue chico");
                    System.out.println("La cantidad de unidades que pidio fue: " + cp);
                    System.out.println("El total de su compra fueron: " + T );
                    System.out.println("El total a pagar es: " + T);
                }
                break;
            case 2:
                T=10*cp;
                if (T >= 2000){
                    System.out.println("Se aplicara 15% de descuento a tu compra.");
                    System.out.println("El tamaño que escogio fue mediana");
                    System.out.println("La cantidad de unidades que pidio fue: " + cp);
                    System.out.println("El total de su compra fueron: " + T +  ". Se aplicara un 15% de descuento: " + (T*.15));
                    System.out.println("El total a pagar es: " + (T*0.85));
                } else {
                    System.out.println("No se aplicara descuento a tu compra.");
                    System.out.println("El tamaño que escogio fue mediana");
                    System.out.println("La cantidad de unidades que pidio fue: " + cp);
                    System.out.println("El total de su compra fueron: " + T );
                    System.out.println("El total a pagar es: " + T);
                }
                break;
            case 3:
                T=20*cp;
                if (T >= 2000){
                    System.out.println("Se aplicara 15% de descuento a tu compra.");
                    System.out.println("El tamaño que escogio fue grande");
                    System.out.println("La cantidad de unidades que pidio fue: " + cp);
                    System.out.println("El total de su compra fueron: " + T + ". Se aplicara un 15% de descuento: " + (T*.15));
                    System.out.println("El total a pagar es: " + (T*0.85));
                } else {
                    System.out.println("No se aplicara descuento a tu compra.");
                    System.out.println("El tamaño que escogio fue grande");
                    System.out.println("La cantidad de unidades que pidio fue: " + cp);
                    System.out.println("El total de su compra fueron: "  + T );
                    System.out.println("El total a pagar es: " + T);
                }
                break;
            default:
            System.out.println("Error");
                break;
        }
    }
}
