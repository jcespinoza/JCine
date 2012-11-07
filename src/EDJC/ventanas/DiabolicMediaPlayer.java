
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.ventanas;

/*********************/
ESTA MIERDA NO FUNCIONA
/*********************/
//io.File para cuando se crea el archivo
import java.io.File;
//esta exception para cuando la URL esta mala
import java.net.MalformedURLException;
//URL para poder crear objetos de este tipo y pasarselo a MediaPanel
import java.net.URL;
//JFileChooser para elegir el archivo
import javax.swing.JFileChooser;
//Para crear ventanas
import javax.swing.JFrame;
/**
 *
 * @author Jay C Espinoza
 */
public class DiabolicMediaPlayer {
    public static void main(String[] args) {
        JFileChooser jfc = new JFileChooser();
        //abre el dialogo de escoger archivo, guarda el entero que devuelve para uso posterior
        int result = jfc.showOpenDialog(null);
        
        //verifica que el usuario eligio un archivo
        if(result == JFileChooser.APPROVE_OPTION){
            //crea un objeto URL inicializado con null
            URL mediaURL = null;
            try{
                //intenta sacar la URI (Uniform Resource Identificator) de el archivo seleccionado, y pasarlo despues a URL
                //(Uniform Resource Locator)
                mediaURL = jfc.getSelectedFile().toURI().toURL();
                //atrapa la Exception mas probable
            }catch(MalformedURLException me){
                //y lo escupe a la consola
                System.out.println("No se puede crear URL con este archivo");
            }
            //Si el objeto es null es porque la URL nunca cambio entonces no se hace nada
            if(mediaURL != null){
                //crea una ventana con ese titulo
                JFrame jf = new JFrame("Reproductor Diabolico de Media");
                //establece lo que sucede cuando se da clik en la X de la ventana
                jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                //Crea un objeto de nuestra clase MediaPanel, que es el control que contiene al reproductor en si
                MediaPanel mp = new MediaPanel(mediaURL);
            }
        }
            
    }
}
