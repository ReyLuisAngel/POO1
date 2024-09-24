// Calcula mayor, promedio y busca en un arreglo de temperaturas
public class p90_Temperaturas{
    public static void Mostrar(double[] t) {
        for(double v : t)
            System.out.print(v + " ");
    }

    public static void Zero(double[] t) {
        for(int i=0; i < t.length; i++)
            if(t[i] > 10) t[i]=0;
    }

    

    public static int Buscar(double t[], double b) {
        int pos=-1;
        for(int i=0; i < t.length; i++)
            if( t[i] == b )
                pos = i;
        return pos;
    }

    public static void main(String[] args) {
        double[] temps = {2.34, 44.56, 7.89, 0.5, 2.5, 4.67, 40.3, 22.35, 56.22};
        double temp = 2.34;
        int pos=0;
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("\nLas temperaturas son:");
        Mostrar(temps);
        pos = Buscar(temps,temp);

        if( pos!= -1) {
            System.out.printf("\nLa temperatura %.2f fue encontrado en la posición %d\n", temp, pos);
            temp=7.89;
            pos=2;
            System.out.printf("\nLa temperatura %.2f fue encontrado en la posición %d\n", temp, pos);
        } else
            System.out.println("\nEl elemento no existe");
        Zero(temps);
        Mostrar(temps);
        }
        
    }