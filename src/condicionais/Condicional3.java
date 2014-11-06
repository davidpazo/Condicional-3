
package condicionais;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Condicional3 {
    public double num1;
    public double num2;
    
    public Condicional3(){
    }
    public Condicional3(double num1, double num2){
        this.num1=num1;
        this.num2=num2;
    }
    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public double pedirDato(String a){
        String respuesta = JOptionPane.showInputDialog("Introduce " + a + " dato");
        double b = Double.parseDouble(respuesta);
        return b;
    }
    public void comparacionSimple (){
        if (num1>num2){
            JOptionPane.showMessageDialog(null, "El numero mayor es el primer numero: " + num1);
        }      
    }
    public void comparacion (){
        if (num1>num2){
            JOptionPane.showMessageDialog(null, "El numero mayor es el primer numero: " + num1);
        }
        else {
            if (num1==num2){
                JOptionPane.showMessageDialog(null, "El primer numero es igual al segundo");
            }
            else{
            JOptionPane.showMessageDialog(null, "El segundo numero es mayor: " + num2);
            }
        }
    
    }
}
