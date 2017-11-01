/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evajava1;
import javax.swing.JOptionPane;//Paquete para usar ventanas-Paso 1
/**
 *
 * @author LAB08
 */
public class DatosPersonales 
{
    
   public static void main(String[] dato)
   
 {
           
//Paso2
String nombre;
int edad;
int incremento;    

//Paso 3
//El showImput recibe datos de entrada por ventana
nombre =(JOptionPane.showInputDialog("Digite su nombre"));
edad =Integer.parseInt(JOptionPane.showInputDialog("digite su edad"));
incremento =edad+20;

JOptionPane.showMessageDialog(null, "Bienvenido" +nombre+ " En 20 años edad sera "+incremento +" años");

}
   
 
      
   }