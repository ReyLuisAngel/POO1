import java.util.Scanner;

public class p91_MayoresAlPromedio {
    public static void Mostrar(Float[] arre) {
        for(double v : arre)
            System.out.print(v + " ");
    }


    public static float IngresoSuma() {
        int n;
        float m, r;
        r=0;
        Scanner obj = new Scanner(System.in);
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Cuantos números? "); n = obj.nextInt();
            Float[] arre = new Float[n];

            for(int i=0; i<n; i++) {
                System.out.print("Ingresa un numero. "); m = obj.nextFloat();
                arre[i]=m;
                r=r+m;
            }
            System.out.printf(" \nLa suma de los terminos es = %,f\n",r);
            System.out.println("El promedio es: " + r/n);
            Mostrar(arre);
            System.out.println("\nLos numeros arriba del promedio son:");
            for(double v : arre)
            if (v>r/n)
                System.out.print(v + " ");
            return r;
    }
  
    public static void main(String[] args) {
        float s;
        s=IngresoSuma();
    }
}
