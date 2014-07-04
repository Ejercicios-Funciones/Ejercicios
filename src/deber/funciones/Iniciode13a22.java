/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deber.funciones;

/**
 *
 * @author Wellington Reyes
 */
public class Iniciode13a22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String matriz[][] = new String[3][3];
        matriz[0][0] = "a";
        matriz[0][1] = "b";
        matriz[0][2] = "c";
        matriz[1][0] = "d";
        matriz[1][1] = "e";
        matriz[1][2] = "f";
        matriz[2][0] = "g";
        matriz[2][1] = "h";
        matriz[2][2] = "i";
        Ej21 prueba = new Ej21();
        System.out.println(prueba.Matriz1(matriz));
    }
}
