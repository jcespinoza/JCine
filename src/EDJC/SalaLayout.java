package EDJC;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jay C Espinoza
 */
public class SalaLayout {
    private boolean[][] sillas;
    
    public SalaLayout(int filas, int cols){
        sillas = new boolean[filas][cols];
    }

    @Override
    public String toString(){
        String res = "";
        for(int i = 0; i < sillas.length; i++){
            for(int j = 0; j < sillas[i].length; j++){
                res += (sillas[i][j])?"O":" ";
            }
            res += "\n";
        }
        return res;
    }
}