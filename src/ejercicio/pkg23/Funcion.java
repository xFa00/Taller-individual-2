/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg23;


public class Funcion {
    public static Double[] solucion(double A, double B, double C){
        double solucion,solucionUno,solucionDos,dependiente;
        
        dependiente=Math.pow(B,2)- 4*A*C;
        if(dependiente < 0){
            return null;
        } else if(dependiente == 0){
            solucion= -B/(2*A);
            return new Double[] { solucion };
        }else{
            solucionUno= (-B + Math.sqrt(dependiente)) / (2*A);
            solucionDos= (-B - Math.sqrt(dependiente)) / (2*A);
            return new Double[] { solucionUno, solucionDos };
        }
        
    }
    
}
