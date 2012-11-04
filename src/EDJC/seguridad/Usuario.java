/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.seguridad;

import java.util.logging.Logger;
import sun.security.util.Password;

/**
 *
 * @author Jay C Espinoza
 */
public class Usuario {
    private String username;
    private char[] password;
    private String NombreCompleto;
    private TipoUsuario tipo;
    private boolean CredencialActiva = true;
    
    public Usuario(String username, char[] pass, TipoUsuario tipo){
        this.username = username;
        password = pass;
        this.tipo = tipo;
    }
    /**
     * Metodo para comparar objetos de tipo Usuario.
     * @param obj el <code>Object</code> con el cual se va a comparar.
     * @return <code>true</code> Si <code>obj</code> es una instancia de <code>Usuario</code>, 
     * son del mismo <code>TipoUsuario</code> tiene el mismo <code>username</code> y mismo <code>nombreCompleto</code>. 
     * @return <code> false</code> de lo contrario.
     */
    @Override
    public boolean equals(Object obj){
        boolean sameObjectType = obj instanceof Usuario;
        boolean sameType = this.tipo == ((Usuario)obj).tipo;
        boolean sameUsername = this.username == ((Usuario)obj).username;
        boolean sameNombreCompleto = this.NombreCompleto == ((Usuario)obj).NombreCompleto;
        return sameObjectType && sameUsername && sameNombreCompleto && sameType;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Metodo para establecer el <code>password</code> de un <code>Usuario</code>.
     * @param password El nuevo password.
     * @throws IllegalPasswordLengthException Si el password tiene menos de 6 caracteres.
     */
    public void setPassword(char[] password) throws IllegalPasswordLengthException{
        if(password.length < 6)
            throw new IllegalPasswordLengthException(password.length);
        
        this.password = password;
    }

    public void setTipo(TipoUsuario tipo){
        this.tipo = tipo;
    }

    public void setCredencialActiva(boolean CredencialActiva) {
        this.CredencialActiva = CredencialActiva;
    }
    
    public String getUsername() {
        return username;
    }

    public char[] getPassword() {
        return password;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public boolean isCredencialActiva() {
        return CredencialActiva;
    }
}
