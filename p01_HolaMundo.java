//Mandar un saludo a la pantalla
public class p01_HolaMundo {
    public static void main(String[] args) {
        String amigo = "Juanma";
        String hermano = "Tony";
        String mensaje = String.format("Tanto %s como %s desean aprender Java", amigo, hermano);

        System.out.println("Hola Mundo desde el lenguaje Java");
        System.out.println("\n Hola amigo"+ amigo + "bienvenido a Java");
        System.out.println("\n Mi amigo es" + "mi hermano es" + hermano);
        System.out.println("\n" + mensaje);

    }
    
}