import javax.swing.*;
/** Programa de Contraseña
 * @author Manuel Abelino Roberto: numControl 18161174
 * @version 1.0
 * La problematica que se plantea es la siguiente
 * El usuario ingresara una contraseña que corresponde a la de una cuenta x , sin embargo solo tendra 3 oportunidades para poder accesar,
 * si el usuario no acierta a la contrseña el programa finaliza mostrando un mensaje que no ha podido accesar
 * si el usuario acierta la contraseña, entonces el programa finaliza mostrando un mensaje que le da la bienvenida :)
 */

public class Contraseña
{
    /** Declaracion de la variable contra 
     *  a esta variable se le asigna un dato String cualquiera
     */
    private static final String contra = "Tomas09"; 
    /**Metodo main estatico
     * metodo simple para poder accionar el metodo sin necesidad de crear un objeto
     */
    public static void main(String[] args){
       int cont=3;
       do{
        String intento = JOptionPane.showInputDialog("Ingresa la contraseña");
        if(intento.equals(contra)){
           JOptionPane.showMessageDialog(null, "La contraseña es correcta");
           cont=0;
        }else{
           cont--;
            JOptionPane.showMessageDialog(null, "La contraseña ingresada es incorrecta\nintentos: "+cont);
           if(cont==0){
              JOptionPane.showMessageDialog(null,"Has perdido tus oportunidades. Hasta la proximaaaaa");
            }
        }
        }while(cont!=0);
    }
}