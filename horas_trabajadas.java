package trabajadores;

import javax.swing.JOptionPane;

public class horas_trabajadas {
	
	public static void main(String[] args) {
        
        String horasStr = JOptionPane.showInputDialog("Ingrese las horas trabajadas:" + "\n" + "si se ingresa mas de 11 horas trabajadas se aumenta $300" + "\n" + "la hora esta $250");

        
        int horasTrabajadas = Integer.parseInt(horasStr);

        // Definir la tarifa por hora y el bono
        final int TARIFA_HORA = 250;
        final int BONO = 300;

        // Calcular el salario base
        int salario = horasTrabajadas * TARIFA_HORA;

       
        if (horasTrabajadas > 11) {
         
            salario += BONO;
        }

        
        JOptionPane.showMessageDialog(null, "El salario total es: " + salario + " pesos");
    }


}
