package p147_TercerParcial;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class JugadorApp extends JFrame {
    private ArrayList<Jugador> jugadores;
    private JTable tabla;
    private JButton btnAgregar, btnGrabar;
    private JTextField tfNombre, tfEdad, tfSexo, tfEstadoCivil, tfDescripcion, tfSalario;
    private DefaultTableModel model;

    public JugadorApp() {
        jugadores = new ArrayList<>();
        setTitle("Gestión de Jugadores");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem salir = new JMenuItem("Salir");
        menuArchivo.add(abrir);
        menuArchivo.add(guardar);
        menuArchivo.add(salir);
        
        JMenu menuAyuda = new JMenu("Ayuda");
        JMenuItem acercaDe = new JMenuItem("Acerca de...");
        menuAyuda.add(acercaDe);
        
        menuBar.add(menuArchivo);
        menuBar.add(menuAyuda);
        setJMenuBar(menuBar);

        model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Edad");
        model.addColumn("Sexo");
        model.addColumn("Estado Civil");
        model.addColumn("Descripción");
        model.addColumn("Salario");

        tabla = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tabla);
        add(scrollPane, BorderLayout.CENTER);

        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(7, 2));
        panelDatos.add(new JLabel("Nombre:"));
        tfNombre = new JTextField();
        panelDatos.add(tfNombre);
        panelDatos.add(new JLabel("Edad:"));
        tfEdad = new JTextField();
        panelDatos.add(tfEdad);
        panelDatos.add(new JLabel("Sexo:"));
        tfSexo = new JTextField();
        panelDatos.add(tfSexo);
        panelDatos.add(new JLabel("Estado Civil:"));
        tfEstadoCivil = new JTextField();
        panelDatos.add(tfEstadoCivil);
        panelDatos.add(new JLabel("Descripción:"));
        tfDescripcion = new JTextField();
        panelDatos.add(tfDescripcion);
        panelDatos.add(new JLabel("Salario:"));
        tfSalario = new JTextField();
        panelDatos.add(tfSalario);

        add(panelDatos, BorderLayout.NORTH);

        JPanel panelBotones = new JPanel();
        btnAgregar = new JButton("Agregar");
        btnGrabar = new JButton("Grabar");
        panelBotones.add(btnAgregar);
        panelBotones.add(btnGrabar);
        add(panelBotones, BorderLayout.SOUTH);

        btnAgregar.addActionListener(e -> agregarJugador());
        btnGrabar.addActionListener(e -> grabarJugador());

        abrir.addActionListener(e -> cargarArchivo());
        guardar.addActionListener(e -> guardarArchivo());
        salir.addActionListener(e -> System.exit(0));
        acercaDe.addActionListener(e -> mostrarAcercaDe());
    }

    private void agregarJugador() {
        String nombre = tfNombre.getText();
        int edad = Integer.parseInt(tfEdad.getText());
        char sexo = tfSexo.getText().charAt(0);
        String estadoCivil = tfEstadoCivil.getText();
        String descripcion = tfDescripcion.getText();
        double salario = Double.parseDouble(tfSalario.getText());

        Jugador nuevoJugador = new Jugador(nombre, edad, sexo, estadoCivil, descripcion, salario);
        jugadores.add(nuevoJugador);
        model.addRow(new Object[]{nombre, edad, sexo, estadoCivil, descripcion, salario});
    }

    private void grabarJugador() {
        String nombre = tfNombre.getText();
        int edad = Integer.parseInt(tfEdad.getText());
        char sexo = tfSexo.getText().charAt(0);
        String estadoCivil = tfEstadoCivil.getText();
        String descripcion = tfDescripcion.getText();
        double salario = Double.parseDouble(tfSalario.getText());

        Jugador jugador = new Jugador(nombre, edad, sexo, estadoCivil, descripcion, salario);
        jugadores.add(jugador);
        model.addRow(new Object[]{nombre, edad, sexo, estadoCivil, descripcion, salario});
    }

    private void cargarArchivo() {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            String archivo = chooser.getSelectedFile().getAbsolutePath();
            jugadores = Utileria.cargarDatos(archivo);
            actualizarTabla();
        }
    }

    private void guardarArchivo() {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            String archivo = chooser.getSelectedFile().getAbsolutePath();
            Utileria.guardarDatos(archivo, jugadores);
        }
    }

    private void actualizarTabla() {
        model.setRowCount(0);  
        for (Jugador jugador : jugadores) {
            model.addRow(new Object[]{jugador.getNombre(), jugador.getEdad(), jugador.getSexo(), jugador.getEstadoCivil(), jugador.getDescripcion(), jugador.getSalario()});
        }
    }

    private void mostrarAcercaDe() {
        JOptionPane.showMessageDialog(this, "Aplicación para gestionar jugadores\nVersión 1.0", "Acerca de", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JugadorApp().setVisible(true));
    }
}
