import java.util.Scanner;

public class p92_MayorMenor {
    public static void Mostrar(Float[] arre) {
        for(double v : arre)
            System.out.print(v + " ");
    }
    public static double Mayor(Float[] arre) {
        double m = arre[0];
        for(int i=0; i < arre.length; i++)
            if(arre[i] > m) m = arre[i];
        return m;
    }
    public static double Menor(Float[] arre) {
        double m = arre[0];
        for(int i=0; i < arre.length; i++)
            if(arre[i] < m) m = arre[i];
        return m;
    }
    public static void main(String[] args) {
        int n;
        float m, t;
        Scanner obj = new Scanner(System.in);
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Cuantos números? "); n = obj.nextInt();
            Float[] arre = new Float[n];

            for(int i=0; i<n; i++) {
                System.out.print("Ingresa un numero. "); m = obj.nextFloat();
                arre[i]=m;
            }
        System.out.println("El numero mayor es: "+ Mayor(arre));
        System.out.println("El numero menor es: "+ Menor(arre));
    }
}
