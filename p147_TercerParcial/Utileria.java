package p147_TercerParcial;

import java.io.*;
import java.util.ArrayList;

public class Utileria {
    public static ArrayList<Jugador> cargarDatos(String archivo) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            jugadores = (ArrayList<Jugador>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return jugadores;
    }

    public static void guardarDatos(String archivo, ArrayList<Jugador> jugadores) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(jugadores);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
