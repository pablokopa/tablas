import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Tablas {
    public Tablas(){
        JFrame ventana = new JFrame("Tablas");
        ventana.setLayout(null);

        JLabel textoNombre = new JLabel("NOMBRE");
        textoNombre.setBounds(40,50,100,20);

        JLabel textoApellido = new JLabel("APELLIDO");
        textoApellido.setBounds(40,100,100,20);

        /* Cuadros de texto*/
        JTextField cuadroNombre = new JTextField();
        cuadroNombre.setBounds(130,50,100,20);

        JTextField cuadroApellido = new JTextField();
        cuadroApellido.setBounds(130,100,100,20);

        /* Desplegable */
        JComboBox<String> desplegable = new JComboBox<>();
        desplegable.addItem("DAM 1");
        desplegable.addItem("DAM 2");
        desplegable.addItem("ASIR 1");
        desplegable.addItem("ASIR 2");
        desplegable.setBounds(260,50,100,20);

        /* Tabla */
        DefaultTableModel modelo = new DefaultTableModel(); // Modelo de la tabla
        JTable tabla = new JTable(modelo);
        modelo.addColumn( "<html><b>Nombre</b></html>");
        modelo.addColumn("<html><b>Apellido</b></html>");
        modelo.addColumn("<html><b>Curso</b></html>");

        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds( 0, 150, 404, 232 );

        /* Botón */
        JButton boton = new JButton("AGREGAR");
        boton.setBounds(260,100,100,20);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = cuadroNombre.getText();
                String apellido = cuadroApellido.getText();
                String curso = desplegable.getSelectedItem().toString();
                modelo.addRow(new Object[]{nombre, apellido, curso});

                cuadroNombre.setText("");
                cuadroApellido.setText("");
            }
        });

        /* Añadir elementos */
        ventana.add(textoNombre);
        ventana.add(textoApellido);
        ventana.add(cuadroNombre);
        ventana.add(cuadroApellido);
        ventana.add(desplegable);
        ventana.add(boton);
        ventana.add(scroll);


        /* Configuración de ventana*/
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setSize(410, 410);
        ventana.setResizable(false);
        ventana.setVisible(true);
    }
}
