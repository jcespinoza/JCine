/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.seguridad;

/**
 *
 * @author Jay C Espinoza
 */
public class Usuario {
    private String username;
    private char[] password;
    private String NombreCompleto;
    private boolean CredencialActiva = true;
    private String fotoPath;

    public String getFotoPath() {
        return fotoPath;
    }

    public void setFotoPath(String fotoPath) {
        this.fotoPath = fotoPath;
    }
    
    public Usuario(String username){
        this.username = username;
    }
    public Usuario(String username, char[] pass){
        this(username); // :D
        setPassword(pass);
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
        boolean sameUsername = this.username.equals( ((Usuario)obj).username);
        //boolean sameNombreCompleto = this.NombreCompleto.equals( ((Usuario)obj).NombreCompleto);
        return sameObjectType && sameUsername;
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
    public void SetNombreCompleto(String nombre){
        this.NombreCompleto=nombre;
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
    public String getNombreCompleto(){
        return this.NombreCompleto;
    }

    public boolean isCredencialActiva() {
        return CredencialActiva;
    }

    public String getNombreCompleto() {
        return this.NombreCompleto;
    }
}
