import java.util.Random;

public class p93_ParesImpares {
    public static void Mostrar(int[] a) {
        for(double v : a)
            System.out.print(v + " ");
    }

    public static int MostrarP(int[] a) {
        int r;
        r=0;
        for(int i =0 ; i< 100;i++)
            if(a[i]%2==0) {
                System.out.print(a[i]+ " ");
                r=r+1;
            }
        return r;
    }

    public static int MostrarI(int[] a) {
        int x;
        x=0;
        for(int i =0 ; i< 100;i++)
            if(a[i]%2!=0) {
                System.out.print(a[i]+ " ");
                x=x+1;
            }
        return x;
    }

    public static void GeneraAleatorio(int[] a) {
        int min=0, max=20;
        Random rnd = new Random();
        for(int i=0; i < a.length; i++)
            a[i] = Math.abs(rnd.nextInt(max - min)) + min;
    }

    public static void main(String[] args) {
        int MAX=100;
        int t, y;
        int[] A = new int[MAX];
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("El arreglo ya con aletorios generados:\n");
        GeneraAleatorio(A);
        Mostrar(A);
        System.out.println("\nLos numeros pares son: ");
        t=MostrarP(A);
        System.out.println("\nLos numeros impares son:");
        y=MostrarI(A);
        System.out.println("\nLa cantidad de numeros pares es: " + t);
        System.out.println("\n La cantidad de numeros impares es:" + y);
    }
}
