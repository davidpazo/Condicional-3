/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_3_boletin_0;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class T_3_Boletin_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Condicional comp1 = new Condicional();
        Scanner dato = new Scanner(System.in);
        int seleccion = JOptionPane.showOptionDialog( null, "Seleccione una opcion",
                "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, 
                null, new Object[]{ "Comparacion simple", "Comparacion", "Salir"}, null);
        if (seleccion == 0){
            String a = "primer";
            double dato1 = comp1.pedirDato(a);
            a = "segundo";
            double dato2 = comp1.pedirDato(a);
            comp1.setNum1(dato1);
            comp1.setNum2(dato2);
            comp1.comparacionSimple();
        }
        if (seleccion == 1){
            String a = "primer";
            double dato1 = comp1.pedirDato(a);
            a = "segundo";
            double dato2 = comp1.pedirDato(a);
            comp1.setNum1(dato1);
            comp1.setNum2(dato2);
            comp1.comparacion();
        }
        if (seleccion == 2){
            JOptionPane.showMessageDialog(null, "Esta saliendo del programa", "Salir", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
