/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_18;


public class SalarioNeto {
    public static double CalcularSalarioNeto(double salarioB, double retencion){
        double salarioN;
        retencion= salarioB*(retencion/100);
        salarioN = salarioB-retencion;
         return salarioN;
    }
}
