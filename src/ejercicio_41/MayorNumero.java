/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_41;

import java.util.List;

public class MayorNumero {
    public static double encontrarMayor(List<Double> numeros) {
        double maximo = Double.NEGATIVE_INFINITY;

        for (double numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }

        return maximo;
    }
}








