/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_40;

import java.util.ArrayList;
import java.util.List;


public class CalculadoraNumeros {
    public static List<Double> calcularResultados(List<Double> numeros) {
        List<Double> resultados = new ArrayList<>();
        for (double numero : numeros) {
            double raizCuadrada = Math.sqrt(numero);
            double cuadrado = numero * numero;
            double cubo = numero * numero * numero;

            resultados.add(raizCuadrada);
            resultados.add(cuadrado);
            resultados.add(cubo);
        }
        return resultados;
    }
}

