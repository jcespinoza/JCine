package EDJC;

import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jay C Espinoza
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SalaLayout sl = new SalaLayout(4,5);
        sl.setTodasVisibles();
        System.out.println(sl);
    }
}