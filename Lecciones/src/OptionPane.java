import javax.swing.*;
public class OptionPane {

    public static void main(String[] args) {
        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
        String edad = JOptionPane.showInputDialog("Introduce tu edada, por favor");

        /* parseInt pertenece a la clace Integer*/

        int edad_usuario = Integer.parseInt(edad);
        edad_usuario++;
        System.out.println("Hola " + nombre_usuario + " Tendras " + edad_usuario + " años");
    }
        String nombre = edad_usuario
}
