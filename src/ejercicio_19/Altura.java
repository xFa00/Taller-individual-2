/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triangulo_E;

public class Altura {
    public static double calcular_altura(double ladoX){// funcion que permite calcular la altura
        double altura; // Variable altura
        altura= Math.sqrt((Math.pow(ladoX,2))-(Math.pow((ladoX/2),2)));// Formula de pitagoras para conseguir la altura
        altura= Math.round(altura*100d)/100d;
        return altura;
     }
    }
    

