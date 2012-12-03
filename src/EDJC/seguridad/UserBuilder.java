/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.seguridad;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author Edgardo Castellanos
 */
public class UserBuilder {
    
    ArrayList<Usuario> users;
    Usuario user;
    
        public UserBuilder(File[] files){
            for(int i=0; i<files.length; i++){
            try{
                RandomAccessFile usuario=new RandomAccessFile("user_"+user.getNombreCompleto(),"rw");
                usuario.writeUTF("user");
                usuario.writeUTF(user.getUsername());
                usuario.writeUTF(user.getNombreCompleto());
                //password :S
            }catch(Exception e ){
                System.out.println("Error: "+e.getMessage());
            }
            
            }
        }
        
        public UserBuilder(String username, String nombre, char[] Password){
            try{
           RandomAccessFile usuario=new RandomAccessFile("user_"+username,"rw");
           usuario.writeUTF("user");
           usuario.writeUTF(username);
           usuario.writeUTF(nombre);
           //password
            }catch(Exception e ){
                System.out.println("Error: "+e.getMessage());
            }
        }
        
        public UserBuilder(File file){
            try{
            RandomAccessFile usuario=new RandomAccessFile("user_"+user.getNombreCompleto(),"rw");
            usuario.writeUTF("user");
            usuario.writeUTF(user.getUsername());
            usuario.writeUTF(user.getNombreCompleto());
           //password :S
            }catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }
        }
        
        public UserBuilder(){
            
        }
     
    public void setUsername(String username){
        boolean error=false;
        do{
        
        if(username.length()<10){
            user.setUsername(username);
            error=false;
        }else{
            System.out.println("Username no debe tener mas de 10 de caracteres");
            error=true;
        }
             }while(error);
        }
    
    public void setNombreCompleto(String nombre){
        boolean error=false;
        do{
            if(nombre.length()<20){
                user.SetNombreCompleto(nombre);
                error=false;
            }else{
                System.out.println("Nombre no puede tener mas de 20 caracteres");
                error=true;
            }
        }while(error);
    }
    
    public void setPassword(char[] password){
        user.setPassword(password);
    }
    
    public String getUsername(){
        return user.getUsername();
    }
    
    public String getNombreCompleto(){
        return user.getNombreCompleto();
    }
    
    public char[] getPassword(){
        return user.getPassword();
    }
}
