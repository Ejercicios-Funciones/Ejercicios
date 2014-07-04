/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deber.funciones;

import java.awt.List;

/**
 *
 * @author Wellington Reyes
 */
public class Ej13 {
    public int[] Ordenar(int[] valores){
    int respaldo[] = new int[valores.length];
    int cont = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < 0) {
                respaldo[cont] = valores[i];
                cont++;
                }
        }
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] >= 0) {
                respaldo[cont] = valores[i];
                cont++;
                }
        }
        return respaldo;
    }
    
}
