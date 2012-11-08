/****************/
//this shit doesnt work it always throws the exceptions
/*****************************/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.ventanas;

import java.awt.BorderLayout;
import java.awt.Component;
import java.io.IOException;
import java.net.URL;
import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.swing.JPanel;
/**
 *
 * @author Jay C Espinoza
 */


public class MediaPanel extends JPanel
{
   public MediaPanel( URL mediaURL )
   {
      setLayout( new BorderLayout() ); // Le aplica BorderLayout al panel
      
      //Usa compnentes livianos y horribles para mejor compatibilidad
      Manager.setHint( Manager.LIGHTWEIGHT_RENDERER, true );
      
      try
      {
          //intenta agregar un resproductor al panel
          
          
          //primero crea un reproductor para reproducir la multimedia especificada en la URL
         Player mediaPlayer = Manager.createRealizedPlayer( mediaURL );
         
         //obtiene los componentes visuales y los controles del reproductor para poder agregarlos al panel
         Component video = mediaPlayer.getVisualComponent();
         Component controls = mediaPlayer.getControlPanelComponent();
         
         //si los componentes visuales no son null los agrega
         if ( video != null ) 
            add( video, BorderLayout.CENTER );
         
         //si los controles no son null los agrega
         if ( controls != null ) 
            add( controls, BorderLayout.SOUTH );
         
         mediaPlayer.start(); // empieza a reproducir el archivo
      }
      catch ( NoPlayerException noPlayerException )//captura esta exception que lanzo en caso de que no exista reproductor para el archivo
      {
         System.err.println( "No hay reproductor ni mier..." );
          System.out.println(noPlayerException);
      }
      catch ( CannotRealizeException cannotRealizeException )//captura esta exception que se lanza si no se puede construir el reproductor
          //esto podria pasar si la URL no sirve
      {
         System.err.println( "No se puede crear el reproductor" );
          System.out.println(cannotRealizeException);
      } // end catch
      catch ( IOException iOException )//captura esta exception por si el archivo no existe o esta corrupto
      {
         System.err.println( "No se pudo leer el archivo" );
          System.out.println(iOException);
      }
   }
}
